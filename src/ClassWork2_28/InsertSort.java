package ClassWork2_28;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args){
        int[] numArray = {10,6,15,4,1,45};
        System.out.println("original " + Arrays.toString(numArray));
        //Insert the alogrithm below
        //Sorts from right to left
        for(int k =1; k < numArray.length-1; k++){
            System.out.println("k " +k);
            int temp = numArray[k];
            System.out.println("temp " +temp);
            int j = k-1;
            while(j >= 0 && temp <= numArray[j]){
                System.out.println("j " + j);
                System.out.println("Num j " + numArray[j]);
                numArray[j+1] = numArray[j];
                System.out.println("num j+1 " + numArray[j+1]);

                j = j-1;
            }
            numArray[j+1] = temp;
        }
        System.out.println(Arrays.toString(numArray));
    }

}
