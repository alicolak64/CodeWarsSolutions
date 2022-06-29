public class StringPolynomialConverter{

  static String convertString(int[] pol){

    String str = "";
    int counter=0;
    
    for( int i = pol.length-1 ; i >= 0 ; i-- ) {
        
        if ( pol[i] != 0  &&  i == 0 ){
            
            if ( pol[i] == 1 ) 
                str += "+1";
            else if ( pol[i] == -1 ) 
                str += "-1";
            else if ( pol[i]>1 )
                str += "+"+pol[i];
            else 
                str += pol[i];
            
        } else if( pol[i] != 0 && i == 1 ){
            
            if ( pol[i] == 1 ) 
                str += "+x";
            else if ( pol[i] == -1 ) 
                str += "-x";
            else if ( pol[i] > 1 ) 
                str += "+" + pol[i] + "x";
            else 
                str += pol[i] + "x";
            
        } else if ( pol[i] != 0 && i > 1 ) {
            
            if ( pol[i] == 1 ){
                
                str += "+x^" + i;
                str++;
                
            } else if ( pol[i] == -1 ){
                
                str += "-x^" + i;
                str++;
                
            }
            else if ( str != 0 && pol[i] > 1 ){
                
                str += "+" + pol[i] + "x^" + i;
                
            } else  {
                
                str += pol[i] + "x^" + i;
                str++;
                
            }
            
        }
        
    }
    
    if( str.length() > 0 && str.charAt(0) == '+' )
        str = str.substring(1);
    
    return str;
    
  }

}