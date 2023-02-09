package ClassWork2_7;

public class GenericMethodTest {

    public static void  main (String[] args){

        var geoff = 'q';
        String[] StringArray = {"billy", "bob", "joe"};
        Double[] DoubleArray = {1.0,2.0,3.0};
        Integer[] IntArray = {1,2,3};

        printArray(StringArray);
        printArray(DoubleArray);
        printArray(IntArray);

    }

    //generics

    public static <E> void printArray(E[] inoutArray){

        for(E element : inoutArray) {
            System.out.print(" " + element);
        }
        System.out.println(" ");

    }

    public static <F extends Comparable<F>> void printter(F[] output){

    }

}
