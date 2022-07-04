public class SumOfNumbersFrom0ToN{

  public static String showSequence(int value){

    String str = "";
    int sum = 0;

    if(value>0){

      for(int i=0; i<= value; i++){

        str += i ;

        if( i != value ) 
	  str += "+" ;
        else 
          str += " = ";

        sum += i;

      }

      return str + sum;

    }

    else if(value==0)
      return "0=0" ;
    
    else 
      return value + "<0" ;

  }

}