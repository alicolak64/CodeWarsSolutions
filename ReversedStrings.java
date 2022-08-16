public class ReversedStrings {


  public static String solution(String str) {
 
    String reversed = "";

    for ( int i = str.length() ; i > 0 ; i-- )
      reversed += str.substring( i - 1, i);

    return reversed;

  }

}