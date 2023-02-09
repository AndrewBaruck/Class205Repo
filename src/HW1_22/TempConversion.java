package HW1_22;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scanner = new Scanner(System.in);

        // Below this comment: declare any other variables you may need
        double input;
        System.out.print("Enter temperature in Fahrenheit : ");
        input = scanner.nextDouble();
        System.out.println("");
        // to store the user's input and the Kelvin equivalent value


        // Below this comment: collect the requried inputs from the user

        System.out.println(input + " degrees Fahrenheit is " + FahrenheitToKelvin(input) + " Kelvin");

        // Below this comment: call your FahrenheitToKelvin method


        // Below this comment: disply the required results


    }

    // define your FahrenheitToKelvin method here below
    public static double FahrenheitToKelvin(double a){
        DecimalFormat df = new DecimalFormat("0.00");
        double kelv = (a - 32) * 5/9 + 273.15;
        String kelva = df.format(kelv);

        return Double.parseDouble(kelva);
    }


}