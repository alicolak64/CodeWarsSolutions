 public class BeginnerSeries3SumOfNumbers
  {
     public int GetSum(int a, int b)

     {

      if( a == b ) 
         return a;

      int temp ;

      if( a > b ) {
         temp = a - b;
         b = a;
         a = b - temp ;
      }

      int sum = 0 ;

      for( int i = a ; i <= b ; i++ )
        sum += i;
      
       return sum;

     }

  }