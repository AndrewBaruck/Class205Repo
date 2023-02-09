package ClassWork1_17;

import java.util.Scanner;
import java.lang.Thread;


public class ClassWork {

    public static void main (String[] args)throws InterruptedException{

//        ClassWork1_11.Checking accounta = new ClassWork1_11.Checking("Ted", 1, 2);
//        System.out.println(accounta.toString());
//
//        ClassWork1_11.Checking accountb = new ClassWork1_11.Checking("Ted", 1, 2);
//
//        Checking accountc = accounta;
//
//        if(accounta.equals(accountb)){
//            System.out.println("True");
//        }
//
//        if(accounta.equals(accountc)){
//            System.out.println("isalsoTrue");

      //DoWhile loop!
        Scanner scanner = new Scanner(System.in);


       //Regular while
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
        //do while
        System.out.print("Enter a number");
       int a = scanner.nextInt();
       i = a;


        do{
        System.out.println(i);

        i--;
        Thread.sleep(10);

        }while(i > 0);








    }




}
