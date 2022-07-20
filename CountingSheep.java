public class CountingSheep {
  public int countSheeps(Boolean[] x) {
    int counter=0;
    for(Boolean b : x ){
      if( b != null && b )
        counter++;
    }
    return counter;
  }
}