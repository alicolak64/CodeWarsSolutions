public class SumWithoutHighestAndLowestNumber
{
    public static int sum(int[] numbers) {

        int a = 0;

        if (numbers == null || numbers.length == 1 || numbers.length == 0) {
            return a;
        }
        int minvalue = numbers[0];
        int maxvalue = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minvalue)
                minvalue = numbers[i];
            if (numbers[i] > maxvalue)
                maxvalue = numbers[i];
            a += numbers[i];
        }

        a = a - (maxvalue + minvalue);
        return a;
  }
  }