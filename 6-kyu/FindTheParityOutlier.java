public class FindTheParityOutlier {

    public static int find(int[] integers) {

        int evencounter = 0;
        int oddcounter = 0;

        int even = integers[0];
        int odd = integers[0];

        for (int temp : integers) {

            if (temp % 2 == 0) {
                evencounter++;
                even = temp;
            } else {
                oddcounter++;
                odd = temp;
            }
        }

        if (evencounter == 1)
            return even;
        else
            return odd;

    }
}