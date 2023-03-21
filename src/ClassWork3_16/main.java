package ClassWork3_16;

import java.util.Scanner;
public class main {

    static int startNum;
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("ENTER A NUMBER TO COUNT DOWN FROM");
        startNum = scanner.nextInt();
        System.out.println("ENTER A STRING TO REVERSE");
        String startString = scanner.next();

        CountDown countDown = new CountDown();
        StringReverser stringReverser = new StringReverser();

        stringReverser.Reverser(startString);
        countDown.countDowner(startNum);


    }

}
