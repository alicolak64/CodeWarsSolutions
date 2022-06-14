package CodeWarsSolutions;

import java.util.Arrays;

/**
 * @author Ali Çolak
 * 13.06.2022
 */
public class Snail {

    public static void main(String[] args) {

        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.toString(snail(array)));

    }

    public static int[] snail(int[][] array) {
        if (array[0].length == 0) return new int[0];
        int tempLength = array.length;
        int length = array.length;
        int arr1 []=new int [length*length];
        int arr2 []=new int [length*length];
        for (int i=0;i<tempLength;i++){
            System.arraycopy(array[i],0,arr1,(length*i),array[i].length);
        }
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < array.length/2; i++){

            int tempArray1 [] = method(arr1,tempLength);

            for (int j=0; j < tempArray1.length ; j++){

                arr2[counter1]=tempArray1[j];
                counter1++;

            }

            if (tempLength > 3){

                int tempArray2 [] = new int[(tempLength-2)*(tempLength-2)];
                counter2=0;

                for (int j=0;j<tempLength-2;j++){

                    for(int k=0;k<tempLength-2;k++){

                        tempArray2[counter2]=arr1[((j+1)*tempLength)+1+k];
                        counter2++;

                    }

                }

                arr1=tempArray2;
                tempLength=tempLength-2;

            }
        }
        if (tempLength%2==1) {
            arr2[ (length * length) - 1 ] = arr1[ (tempLength * tempLength) / 2] ;
        }
        return arr2;
    }
    public static int [] method(int array [],int length){
        int [] tempArray = new int[(length*4)-4];
        int counter = 0;
        for (int i = 0 ;i < length ; i++){
            tempArray [counter] = array[i];
            counter++;
        }
        for (int i = 0 ; i < length-2 ; i++){
            tempArray [counter] = array[(length*(i+2))-1];
            counter++;
        }
        for (int i = 0 ; i < length ; i++){
            tempArray [counter] = array[(length*length)-i-1];
            counter++;
        }
        for (int i = length-2 ; i > 0 ; i--){
            tempArray [counter] = array[(length*(i))];
            counter++;
        }
        return tempArray ;
    }

}
