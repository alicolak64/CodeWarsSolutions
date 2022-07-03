public class SumOfOddCubedNumbers {
 
 public static int cubeOdd(int arr[]) {

   int sum = 0 ;

   for(int i:arr){

     if(i%2==1 || i%2==-1)
       sum += Math.pow(i,3);

   }

   return sum;

 }

}