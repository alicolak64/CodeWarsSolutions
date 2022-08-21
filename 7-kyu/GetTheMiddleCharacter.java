class GetTheMiddleCharacter {

  public static String getMiddle(String word) {

    int strLength = word.length();

    if( strLength ==1 || strLength == 2 ) 
      return word;
    else if( strLength % 2 == 1 ) {
      return word.substring( strLength / 2 , (strLength / 2) + 1 );
    else
      return word.substring( ( strLength / 2 ) - 1 , (strLength / 2 ) + 1 );
    
    }

}