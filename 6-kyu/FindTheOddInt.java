public class FindTheOddInt {

  public static int findIt(int[] array) {

    int counter = 0 ;
    int value = 0;

    for ( int i = 0 ; i < array.length ; i++ ) {

        for ( int j = 0 ; j < array.length ; j++ ) 
            if( array[i] == array[j] )
                counter++;
                
        if( counter % 2 == 1 ) {
            value = array[i];
            counter = 0 ;
        }
    }

    return value;
 
  }

}
