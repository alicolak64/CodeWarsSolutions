package CodeWarsSolutions;

/**
 * @author Ali Çolak
 * 13.06.2022
 */
public class HumanReadableDurationFormat {

    public static String formatDuration(int seconds) {
        if(seconds==0) return "now";
        int a=seconds;
        int sayac=0;
        String son="";
        while (a>0){
            if(a>=31536000){
                sayac++;
                a%=31536000;
            }
            else if (a>=86400){
                sayac++;
                a%=86400;
            }
            else if (a>=3600) {
                sayac++;
                a%=3600;
            }else if (a>=60){
                a%=60;
                sayac++;
            }else if(a>0){
                sayac++;
                a=0;
            }
        }
        int year=0;
        int day=0;
        int hour=0;
        int minute=0;
        int second=0;
        if (seconds>=31536000){
            year=seconds/31536000;
            seconds%=31536000;
        }
        if (seconds>=86400){
            day=seconds/86400;
            seconds%=86400;
        }
        if(seconds>=3600){
            hour=seconds/3600;
            seconds%=3600;
        }
        if (seconds>=60){
            minute=seconds/60;
            seconds%=60;
        }
        if(seconds>0){
            second=seconds;
        }
        String [] y={"year","day","hour","minute","second"};
        int x []={year,day,hour,minute,second};
        int k=0;
        for (int i=0;i<5;i++){
            if (x[i]>1 ){
                son+=x[i]+" "+y[i]+"s";
                if (sayac==5){
                    if (k==0 || k==1 ||k==2) son+=", ";
                    else if(k==3) son+=" and ";
                    k++;
                }
                else if (sayac==4){
                    if (k==0 || k==1) son+=", ";
                    else if(k==2) son+=" and ";
                    k++;
                }else if (sayac==3){
                    if(k==0) son+=", ";
                    else if(k==1) son+=" and ";
                    k++;
                }else if (sayac==2){
                    if (k==0) son+=" and ";
                    k++;
                }
            }
            else if (x[i]==1) {
                son+=x[i]+" "+y[i];
                if (sayac==5){
                    if (k==0 || k==1 ||k==2) son+=", ";
                    else if(k==3) son+=" and ";
                    k++;
                }
                else if (sayac==4){
                    if (k==0 || k==1) son+=", ";
                    else if(k==2) son+=" and ";
                    k++;
                }else if (sayac==3){
                    if(k==0) son+=", ";
                    else if(k==1) son+=" and ";
                    k++;
                }else if (sayac==2){
                    if (k==0) son+=" and ";
                    k++;
                }

            }
        }
        return son;
    }

}
