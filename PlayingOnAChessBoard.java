public class PlayingOnAChessBoard {
  
  public static String game(long n) {

    if (n==0) 
      return "[0]";

    String str = "" ;
    long sum = 0 ;
    for ( long i = 1 ; i <= n - 1 ; i++ ) {
      sum += i ;
    }
    if ( n % 2 == 0 ) {
        str = String.valueOf( sum + (n/2) );
        return "[" + str + "]" ;
    } else {
        str = String.valueOf( ( 2 * sum ) + n );
        return "[" + s + ", 2" + "]" ;
    }

  }

}