public class Mumbling {
    
    public static String accum ( String word ) {

      String str = "" ;
      for ( int i = 0 ; i < word.length() ; i++ ) {
        for ( int j = 0 ; j <= i ; j++ ) {

          if ( j == 0 ) 
            str += word.substring( i , i + 1 ).toUpperCase();
          else
           str += word.substring( i , i + 1 ).toLowerCase();

        }

        str += "-" ;
     
      }

      return str.substring( 0 , str.length() - 1 );
    
    }

}