import java.util.Arrays;

public class ShortestWord {

    public static int findShort ( String str ) {

        String [] parsedStr = str.split("\\ ");

        int min = 10 ;

        for ( String tempParsedStr : parsedStr ) {

            if ( min > Integer.valueOf( tempParsedStr.length() ) )
                min = Integer.valueOf( tempParsedStr.length() ) ;
        }

      return min;

    }
    
}