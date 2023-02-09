package ClassWork1_26;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
        //creating student array - going to display
        //Student[] student = new Student[4]; //Number in array list starts from one, creating it you start from zero to one below this number-This num is fixed
        ArrayList<Student> student = new ArrayList<Student>();

        //student.add();
        try {

            Student student1 = new Student(1, "SE", "shemale", "11301 223 ave ct e", "Buckley, ", "Washington", "98321");
            student.add(student1);
            student.add(new Student(1, "SE", "shemale", "11301 223 ave ct e", "Buckley, ", "Washington", "98321"));
            student.get(0).getAddress().setZip("98391");
            System.out.println(student.get(0));
            //student.get(0).getAddress().add// -- when you print all it adds brackets around the total list, specified it only adds one item.
//            student[0] = new Student(1, "SE", "shemale", "11301 223 ave ct e", "Buckley, ", "Washington", "98321");
//            student[1] = new Student(2, "SE", "male", "11301 224 ave ct e", "Buckley, ", "Washington", "98321");
//            student[2] = new Student(3, "SE", "female", "11301 225 ave ct e", "Buckley, ", "Washington", "98321");
//            student[3] = new Student(4, "SE", "male", "11301 226 ave ct e", "Buckley, ", "Washington", "98321");
//            student[4] = new Student(1, "SE", "male", "11301 223 ave ct e", "Buckley, ", "Washington", "98321");

//            for (int i = 0; i < 4; i++) {
//                System.out.println(student[i]);
//            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Too much data:" + e );
        }
        //This try catch allows us to look for errors that we might know are there to find without crashing the entire code
        //You can either use a general exception or a more specific exception (i.e. ArrayindexOutOfBoundsException)
    }


}
