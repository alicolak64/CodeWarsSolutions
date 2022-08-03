public class CountingDuplicates {
    
  public static int duplicateCount(String text) {

    int counter = 0 ;
    int tempCounter ;
    text = text.toUpperCase() ;

    while ( text.length() != 0 ){

        tempCounter = counter;

        for( int j = 1 ; j < text.length() ; j++ ) {
            if ( text.charAt(0) == text.charAt(j) ) {
                counter++;
                text = text.replace( String.valueOf( text.charAt(0) ) , "" );
            }
        }

        if ( counter == tempCounter )
            text = text.replace( String.valueOf( text.charAt(0) ) , "" );

    }

    return counter;

  }

}