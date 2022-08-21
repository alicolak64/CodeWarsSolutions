public class DecodeTheMorseCode {

    public static String decode(String morseCode) {

        morseCode = morseCode.trim() ;

        String array [] = morseCode.split("\\   ");

        String str = "";

        for (int i = 0 ; i < array.length ; i++ ){

            String [] tempArray = array[i].split("\\ ") ;

            for ( int j = 0 ; j < tempArray.length ; j++ ){

                if (tempArray[j].equals("...."))
                    str += "H";
                else if(tempArray[j].equals("."))
                    str += "E";
                else if(tempArray[j].equals("-.--"))
                    str += "Y";
                else if(tempArray[j].equals(".---"))
                    str += "J";
                else if(tempArray[j].equals("..-"))
                    str += "U";
                else if(tempArray[j].equals("-.."))
                    str += "D";
                else if(tempArray[j].equals(".-"))
                    str += "A";
                else if(tempArray[j].equals("--.-"))
                    str += "Q";
                else if(tempArray[j].equals("..."))
                    str += "S";
                else if(tempArray[j].equals("---"))
                    str += "O";
                else if(tempArray[j].equals("--"))
                    str += "M";
                else if(tempArray[j].equals("-..."))
                    str += "B";
                else if(tempArray[j].equals("-.-."))
                    str += "C";
                else if(tempArray[j].equals("..-."))
                    str += "F";
                else if(tempArray[j].equals("--."))
                    str += "G";
                else if(tempArray[j].equals("--.."))
                    str += "Z";
                else if(tempArray[j].equals(".."))
                    str += "I";
                else if(tempArray[j].equals("-.-"))
                    str += "str";
                else if(tempArray[j].equals(".-.."))
                    str += "L";
                else if(tempArray[j].equals("-."))
                    str += "N";
                else if(tempArray[j].equals(".--."))
                    str += "P";
                else if(tempArray[j].equals(".-."))
                    str += "R";
                else if(tempArray[j].equals("-"))
                    str += "T";
                else if(tempArray[j].equals("...-"))
                    str += "V";
                else if(tempArray[j].equals(".--"))
                    str += "W";
                else if(tempArray[j].equals("-..-"))
                    str += "tempArray";
                else if(tempArray[j].equals(".-.-.-"))
                    str += ".";
                else if(tempArray[j].equals("-.-.--"))
                    str += "!";
                else if(tempArray[j].equals("...---..."))
                    str += "SOS";

            }

            if( i != array.length-1 )
                str += " ";
        }

        return str;
        
    }

}