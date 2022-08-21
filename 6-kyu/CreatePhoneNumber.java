public class CreatePhoneNumber {

  public static String createPhoneNumber( int[] numbers ) {

    String str = "" ;
    for ( int i : numbers ) 
      str += i;
    return "(" + str.substring(0,3) + ") " + str.substring(3,6) + "-" + str.substring(6) ;

  }

}