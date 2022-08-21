class RemoveStringSpaces {

    public static String noSpace(final String word) {

        String str = "";

        for (int i = 0; i < word.length(); i++) {
            if (!word.substring(i, i + 1).equals(" "))
                str += word.substring(i, i + 1);
        }

        return str;
        
    }

}