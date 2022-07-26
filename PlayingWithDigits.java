public class PlayingWithDigits {
  
  public static long digPow(int n, int p) {

    String str = String.valueOf(n) ;
    int sum = 0 ;

    for ( int i = 0 ; i < str.length() ; i++ ) {

    	int tempValue = Integer.valueOf ( str.substring( i , i+1 ) );
        sum += Math.pow( tempValue , p );
        p++;

    }

    if((sum%n==0)) 
	return sum / n ;
    else 
    	return -1;

  }

  
}