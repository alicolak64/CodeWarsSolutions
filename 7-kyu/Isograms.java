public class Isograms {

    public static boolean  isIsogram(String str) {

        if( str.length() == 0 ) 
            return true;

        for ( int i = 0 ; i < str.length() ; i++ ) {

            for ( int j = i + 1 ; j < str.length() ; j++ ) {

                if ( str.charAt(i) == str.charAt(j) || str.substring( i , i + 1 ).equals(str.substring( j , j + 1 ).toUpperCase() ) || str.substring( i , i + 1 ).equals(str.substring( j , j + 1 ).toLowerCase() ) ) 
                    return false;
                
            }

        }

        
        return true;
    
    } 

}