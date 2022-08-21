public class PowersOf2 {

  public static long[] powersOfTwo(int n){
    
    long [] array = new long [n+1];
        for(int i=0; i<=n ; i++) {
            if(i==0)
                array[0] = 1;
            else {
                long x = 1;
                for (int j = 0; j < i; j++) {
                    x*=2;
                }
                String str = String.valueOf(x);
                long l = Long.valueOf(str);
                array[i] = l;
            }
        }
        return array;
  }
}