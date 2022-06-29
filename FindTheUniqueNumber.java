// Make sure your class is public
public class FindTheUniqueNumber {

    public static double findUniq(double arr[]) {

      int n=0;

        out:
        for (int i = 0; i <arr.length ; i++) {

            n=0;

            for (int j = 0; j < arr.length ; j++) {

                if (arr[i]==arr[j] && i!=j) 
		    continue out;

            }

            if (n==0) return arr[i];

        }

        return 5;
    }

}