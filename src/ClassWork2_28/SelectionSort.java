package ClassWork2_28;
import java.util.*;
public class SelectionSort {

    static void selectSort(int numArray[]){
        int n = numArray.length;

        for(int i = 0; i < n-1; i++){
            int minidx = i;
            for(int j = 1+i; i< n ; j++){
                if(numArray[j] < numArray[minidx]){
                    minidx = j;
            }
        }

            int temp = numArray[minidx];
            //numArray[minidx] = numArray[]
    }
}}
