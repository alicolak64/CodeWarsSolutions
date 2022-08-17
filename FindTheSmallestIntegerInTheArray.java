public class FindTheSmallestIntegerInTheArray {

    public static int findSmallestInt(int[] args) {

        int min = args[0];

        for (int i : args) {
            if (min > i)
                min = i;
        }

        return min;
        
    }

}