public class YourOrderPlease {

    public static String order ( String words ) {

        if( words.length() == 0 ) 
            return "";

        int counter = 0;
        String [] array1 = words.split(" ");
        String [] array2 = new String [ array1.length ];

        int k = 0 ;

        for ( int j = 0 ; j < array1.length ; j++ ){

            for ( int i = 0 ; i < array1.length ; i++ ){

                if ( array1[i].contains(String.valueOf(j+1))){

                    array2[k] = array1[i];
                    k++;

                }

            }

        }

        String str = "" ;

        for ( int i = 0 ; i < array2.length ; i++ ){

            str += array2[i];

            if ( i != array2.length - 1 )
                str += " ";
        }

        return str;
    }

}