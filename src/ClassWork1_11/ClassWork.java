package ClassWork1_11;

public class ClassWork{


    public static void main (String[] args){

        Checking accounta = new Checking("Ted", 1, 2);
        System.out.println(accounta.toString());

        Checking accountb = new Checking("Ted", 1, 2);

        Checking accountc = accounta;

        if(accounta.equals(accountb)){
            System.out.println("True");
        }

        if(accounta.equals(accountc)){
            System.out.println("alsoTrue");
        }

    }


}