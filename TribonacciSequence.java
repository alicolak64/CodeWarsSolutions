public class TribonacciSequence {

	public double[] tribonacci( double[] s , int n ) {

    	double [] fib = new double [n];

      	if( n < 3 ) {
        	if( n == 0 ) 
        		return fib;
        	for( int i = 0 ; i < n ; i++ )
            	fib[i] = s[i];
        	return fib;
      	}    

      	fib[0] = s[0];
      	fib[1] = s[1];
      	fib[2] = s[2];

      	for( int i = 0 ; i < n - 3 ; i++ )
        	fib[i+3]=fib[i+2]+fib[i+1]+fib[i];

 	    return fib;
  	}

}