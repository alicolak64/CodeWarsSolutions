public class RegexValidatePINCode {

  public static boolean validatePin ( String pin ) {

    if( pin.length() == 4 || pin.length() == 6 ) {
      for( int i = 0 ; i < pin.length() ; i++ ) {
        int a = pin.charAt(i);
        if(a<48 || a>57) 
          return false;
      }
    } else 
        return pin.length() == 4 || pin.length() == 6 ;      
    
  }

}