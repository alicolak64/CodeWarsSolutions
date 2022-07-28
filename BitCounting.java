public class BitCounting {

  public static int countBits(int n){

    String binary  = "";
    int counter = 0;

    if(n == 0)
        binary = "0";
    
    while(n > 0) {

        int mod = n % 2;
        binary = mod + binary;
        n = n / 2;

    }

    for ( int i = 0 ; i < binary.length() ; i++ )
        if( binary.charAt(i) == '1' ) 
            counter++;
    
    return counter;
    
  }
  
}