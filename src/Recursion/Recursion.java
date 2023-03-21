package Recursion;

public class Recursion {

    public static int fact(int n){

        int result;
        if(n == 0){
            result = 1;
        }
        else{
            result = n * fact(n-1);

            return result;
        }
        return result;
    }

}
