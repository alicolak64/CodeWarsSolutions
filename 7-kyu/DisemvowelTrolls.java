public class DisemvowelTrolls {

    public static String disemvowel(String str) {

        String returnStr = "";

        for( int i = 0 ; i < str.length() ; i++ )
            if ( ! ( 
                str.charAt(i) == 'A' || 
                str.charAt(i) == 'E' || 
                str.charAt(i) == 'O' || 
                str.charAt(i) == 'U' ||
                str.charAt(i) == 'I' ||
                str.charAt(i) == 'a' || 
                str.charAt(i) == 'e' ||
                str.charAt(i) == 'i' ||
                str.charAt(i) == 'o' ||
                str.charAt(i) == 'u' 
                ))

                returnStr += str.substring( i , i + 1 );
        
      return returnStr;
    }

}