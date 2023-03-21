package ClassWork3_16;

public class CountDown {

    void countDowner(int n){

        if(n >= 0){
            System.out.println(n);
            countDowner(n-1);
        }
        else{
            System.out.println("BlastOff!");
        }

    }

}
