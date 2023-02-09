
package ClassWork1_19;
import java.text.DecimalFormat;
public class ClassWork {

    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){

        double a = 3.567;
        
        System.out.println(df.format(a));
    }


}
