public class ExesAndOhs {
  
  public static boolean getXO (String str) {

        int counter1 = 0 ;
        int counter2 = 0 ;

        for ( int i = 0; i < str.length() ; i++ ) {
            if( str.charAt(i) == 'X' || str.charAt(i) == 'x' ) 
              counter1++;
            if( str.charAt(i) == 'O' || str.charAt(i) == 'o' ) 
              counter2++;
        }


        return counter1==counter2;

  }

}