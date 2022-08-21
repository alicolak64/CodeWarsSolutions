import java.util.Arrays;

/**
 * @author Ali Çolak
 * 13.06.2022
 */
public class TheSpeedOfLetters {


    public static void main(String[] args) {

        System.out.println(speedify("GALATASARAY"));

    }


    public static String speedify (final String input) {

        int [] array = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {

            int a = input.charAt(i) - 65;
            array[i] = i + a;

        }
        int max = array[0];

        for (int i : array) {

            if (max < i) {

                max = i;

            }
        }
        String[] finalArray = new String[max + 1];
        StringBuilder str = new StringBuilder();
        Arrays.fill(finalArray, 0, max + 1, " ");

        outLoop:
        for (int i = 0; i < input.length(); i++) {

            for (int j = 0; j < input.length(); j++) {

                if (array[j] == array[i]) {
                    if (j > i) {
                        continue outLoop;
                    }
                }

            }

            finalArray[array[i]] = input.substring(i, i + 1);

        }

        for (String s : finalArray) {

            str.append(s);

        }

        return str.toString();
    }

}
