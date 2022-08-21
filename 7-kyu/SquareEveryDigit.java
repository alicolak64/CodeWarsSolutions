public class SquareEveryDigit  {

  public int squareDigits(int n) {

    String str = String.valueOf(n);
    String returnStr = "" ;

    for ( int i = 0 ; i < str.length() ; i++ ) {
      int tempInt = Integer.valueOf( str.substring( i , i + 1 ) );
      returnStr += ( tempInt * tempInt );
    }

    return Integer.valueOf(returnStr);
  
  }

}