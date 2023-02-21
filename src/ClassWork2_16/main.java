package ClassWork2_16;

public class main {
    public static void main(String[] args) {
        int a = 80;
        int b = 0;

        for (int c = 3; c <= 5; c++) {
            b = 5;
            while (b > c) {
                b = b - 1;
                a = a - b;
            }
            b = b + a;
        }
        System.out.print(b);
    }


}
