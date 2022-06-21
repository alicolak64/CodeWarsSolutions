package CodeWarsSolutions;

/**
 * @author Ali Çolak
 * 13.06.2022
 */
public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        String son="";
        if(seconds>=3600){
            int a=seconds/3600;
            seconds%=3600;
            if(a<10){
                son+="0"+a+":";
            }else
                son+=a+":";
        }else son+="00:";
        if(seconds>=60){
            int x=seconds/60;
            seconds%=60;
            if(x<10){
                son+="0"+x+":";
            }else
                son+=x+":";
        }else son+="00:";
        if(seconds<10){
            son+="0"+seconds;
        }
        else son+=seconds;
        return son;
    }

}
