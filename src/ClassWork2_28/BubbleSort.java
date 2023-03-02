package ClassWork2_28;
import java.util.*;
public class BubbleSort {

    public static void main(String[] args){

        int intArrary[] = {23,5,6,13};

        System.out.println("original" + Arrays.toString(intArrary));
        int n = intArrary.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if (intArrary[j] < intArrary[j+1]){
                    int temp = intArrary[j];
                    intArrary[j] = intArrary[j+1];
                    intArrary[j+1] = temp;
                }
            }

        }
        System.out.println("Final: " + Arrays.toString(intArrary));
    }

}
