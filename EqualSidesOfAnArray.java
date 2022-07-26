public class EqualSidesOfAnArray {

  public static int findEvenIndex ( int[] arr ) {

        int sum1;
        int sum2;

        for ( int i = 0 ; i < arr.length ; i++ ) {
            sum1=0;
            sum2=0;

            for ( int j = 0 ; j < i ; j++ )
                sum1 += arr[j] ;
            
            for ( int j = i+1 ; j < arr.length ; j++ )
                sum2+=arr[j]; 
            
            if(i==0)
                if(sum2==0) 
	            return i;
            
            if (sum1==sum2 )
                return i;
            
        }

        return -1;

  }

}