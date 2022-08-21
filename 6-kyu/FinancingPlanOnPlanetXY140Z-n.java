import java.math.BigInteger;

public class FinancingPlanOnPlanetXY140Z-n {
  
  public static BigInteger  finance(int n) {

    int x = 0;
    BigInteger sum = BigInteger.valueOf(0);

    for(int i=0;i<=n;i++){

      for(int j=i;j<=2*x;j++){

        sum = sum.add(BigInteger.valueOf(j));

      }

    x++;

    }

    return sum;

  }
}

