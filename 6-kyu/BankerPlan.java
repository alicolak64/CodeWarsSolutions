public class BankerPlan {

    public static boolean fortune (int f0, double p, int c0, int n, double i) {

        for (int j=0;j<n-1;j++){

            f0 += ( f0 * ( p / 100 ) ) ;
            f0 -= c0 ;
            c0 += ( c0 * ( i / 100 ) ) ;

        }

        return f0 >= 0;

    }

}