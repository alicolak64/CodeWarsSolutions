import java.util.Arrays;

/**
 * @author Ali Çolak
 * 13.06.2022
 */
public class Interval {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(interval(new int[] {1,2,3,4,5}, "[2,5)")));

    }

    public static int[] interval (int[] array, String str){

        if (array.length==0 || str.length()==0)
            return new int[0] ;

        Arrays.sort(array);

        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',') {
                n = i;
                break;
            }
        }

        int b = Integer.parseInt(str.substring(1, n));
        int s = Integer.parseInt(str.substring(n + 1, str.length() - 1));
        int counter1 = 0;

        for (int i : array) {

            if (i >= b && i <= s) counter1++;

        }

        if(counter1==0) {
            return new int[0];
        }

        int [] arr  = new int[counter1];
        int counter2 = 0;

        for (int i : array) {

            if (i >= b && i <= s) {

                arr [counter2] = i;
                counter2++;

            }

        }

        if (str.charAt(0) == '[') {

            if (!str.endsWith("]")) {

                if (arr [arr .length-1]==s)

                    arr  = Arrays.copyOf(arr , arr .length - 1);

            }

        }else{

            if(str.endsWith("]")) {

                if (arr [0]==b)
                    arr =Arrays.copyOfRange(arr ,1,arr .length);

            }else{

                if (arr [0]==b && arr [arr .length-1]==s )
                    arr =Arrays.copyOfRange(arr ,1,arr .length-1);

            }

        }

        return arr ;
    }

}
