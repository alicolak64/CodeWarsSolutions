public class YouAreASquare {    

    public static boolean isSquare(int n) {

        if(n==0) 
            return true;
        double x = Math.sqrt(n);
        int y = (int) x ;

        
        return ( x / y ) == 1 ;

    }
}