package Recursion;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {

//        Recursion temp = new Recursion();
//
//        int x = temp.fact(6);
//        System.out.print(x);

        inflator();


    }

    public static void inflator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter val:");
        long z = scanner.nextLong();

        hips(z);

    }
    public static void hips(long n){


        if(n == 0){
            System.out.println("hurray!");
            inflator();
        }
        else{
            System.out.println("hip");
            long x = n--;
            x--;
            hips(x);
        }
    }
}
