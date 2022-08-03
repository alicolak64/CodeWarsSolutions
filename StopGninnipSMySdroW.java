public class StopGninnipSMySdroW  {

  public String spinWords(String sentence) {

    String [] array = sentence.split("\\ ");
    String str = "" ;
        
    for ( int i = 0 ; i < array.length ; i++ ) {

        if( array[i].length() >= 5 ){

            String tempStr = "";

            for ( int j = array[i].length() - 1 ; j >= 0 ; j-- ) 
                tempStr += array[i].substring( j , j+1 );

            array[i] = tempStr;

        }

        str += array[i];

        if ( i != array.length - 1 ) 
            str += " ";
        
    }

    return str;

  }

}

