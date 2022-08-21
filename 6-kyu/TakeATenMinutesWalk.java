public class TakeATenMinutesWalk {

	public static boolean isValid(char[] walk) {
		
        int ns=0;
        int we=0;

        for ( char a : walk ){

            if ( a == 'n' ) 
            	ns++;

            else if( a == 's' ) 
            	ns--;

            else if( a == 'w' ) 
            	we++;

            else if( a == 'e' ) 
            	we--;

        }

        return ( ns == 0 && we == 0 ) && (walk.length == 10) ;

    }

}