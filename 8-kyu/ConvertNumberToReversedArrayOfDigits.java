public class ConvertNumberToReversedArrayOfDigits {

  public static int[] digitize(long n) {

    int length = String.valueOf(n).length();
    int [] array = new int [length];

    for (int i = 0; i < length ; i++) {

      array[i] = Integer.valueOf(String.valueOf(n).substring(length-i-1,length-i));

    }

    return array;

  }

}


