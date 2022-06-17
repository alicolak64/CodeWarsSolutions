import java.util.Arrays;

/**
 * @author Ali Çolak
 * 13.06.2022
 */
public class RotateArray {

    public static void main(String[] args) {

        Object [] array = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(rotate( array ,3)));

    }

    public static Object[] rotate (Object[] array , int n ) {
        Object[] tempArray = new Object  [array.length];
        if(array.length<Math.abs(n)){

            if(n<0){

                n*=-1;
                n=n%array.length;
                n*=-1;

            } else
                n=n%array.length;
        }

        if(n>=0){

            int k=n;

            for (int i=0;i<k;i++){

                tempArray [i]=array[array.length-k+i];

            }

            for (int i=0;i<array.length-k;i++){

                tempArray [k+i]=array[i];

            }

        }else if(n<=0){

            int k=n*-1;

            for(int i=0;i< array.length-k;i++){
                tempArray[i]=array[k+i];
            }

            for (int i=0;i<k;i++){
                tempArray[array.length-k+i]=array[i];
            }

        }
        return tempArray;
    }

}
