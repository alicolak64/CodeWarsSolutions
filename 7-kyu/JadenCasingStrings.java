public class JadenCasingStrings {

  public String toJadenCase(String phrase) {

    if ( phrase == null || phrase.equals("") ) 
      return null;
    
    char[] array = phrase.toCharArray();
    
    for ( int i = 0; i < array.length ; i++ ) 
      if ( i == 0 || array[ i - 1 ] == ' ') 
        array[i] = Character.toUpperCase(array[i]);
      
    return new String(array);

  }

}