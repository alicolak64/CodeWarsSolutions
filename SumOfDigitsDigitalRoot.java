public class SumOfDigitsDigitalRoot {

  public static int digital_root(int n) {

    int sum=0;

    while( n > 0 ){

        sum += n % 10;
        n /= 10;

        if ( n == 0 ) {

            if(sum<10)
                break;
            
            n = sum;
            sum = 0;
        }
    }

    return sum;
  }

}
