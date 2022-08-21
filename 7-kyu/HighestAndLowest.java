public class HighestAndLowest {

	public static String highAndLow ( String numbers ) {

        String [] parsedStr = numbers.split("\\ ");

        int min = Integer.valueOf( parsedStr[0] );
        int max = Integer.valueOf( parsedStr[0] );

        for ( String tempParsedStr : parsedStr ) {

            if( min > Integer.valueOf( tempParsedStr ) )
                min = Integer.valueOf( tempParsedStr ) ;
            if ( max < Integer.valueOf( tempParsedStr ) )
                max = Integer.valueOf( tempParsedStr ) ;
        }

        return max + " " + min;
    
    }


} 