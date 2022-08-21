import java.util.Arrays;

public class DescendingOrder {

  public static int sortDesc ( final int num ) {

        String str = "" ;

        String strNum = String.valueOf( num );

        int [] array = new int [strNum.length()];

        for( int i = 0 ; i < strNum.length() ; i++ ) {

            array [i] = Integer.valueOf ( strNum.substring(i,i+1) );

        }

        Arrays.sort(array);

        for( int i = strNum.length()-1 ; i >= 0 ; i-- ) {

            str+=array[i];

        }

        return Integer.valueOf(str);

    }

}