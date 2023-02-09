package HW1_22;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Converter {
    static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scanner = new Scanner(System.in);


        // Below this comment: declare any other variables you may need
        // to store the user's input and the Feet and Inches equivalent value
        double meters;
        String feets;
        // Below this comment: collect the required inputs
        System.out.print("Enter distance in Meters : ");
        meters = scanner.nextDouble();
        // Below this comment: call your MetersToFeetAndInches method
        feets = MetersToFeetAndInches(meters);

        // Below this comment: disply the required results
        System.out.print(df.format(meters) + " meters in Feet and Inches is : " + feets);
    }

    // define your MetersToFeetAndInches method here below
    public static String MetersToFeetAndInches(double a){
        String b;

        double inches = a * 39.37;
        int feets = (int)inches/12;
        double inchesa = inches % 12;

        b = (feets + "' " + df.format(inchesa) + "\" ");

        return b;
    }

}
