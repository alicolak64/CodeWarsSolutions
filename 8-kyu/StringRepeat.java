public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {
        String str = "";
        for (int i = 0; i < repeat; i++) {
            str += string;
        }
        return str;
    }

}