class PersistentBugger {

  public static int persistence(long n) {

    int sum = 1;
    int counter = 0;

    if( n < 10) 
        return 0;
    
    while( n > 0 ){
        sum *= n % 10;
        n /= 10;
        if( n == 0 ){
            counter++ ;
            if( sum < 10)
                break ;
            
            n = sum ;
            sum = 1 ;
        }
    }

    return counter;

  }

}
