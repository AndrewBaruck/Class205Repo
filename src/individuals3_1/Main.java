package individuals3_1;

public class Main {


    public static void main(String[] args){
        MyArrayList geoff = new MyArrayList();
        geoff.addToEnd(11);
        geoff.addToEnd(22);
        geoff.addToEnd(33);
        geoff.addToEnd(33);
        geoff.addToEnd(33);
        geoff.addToEnd(33);
        geoff.addToEnd(33);
        geoff.addToEnd(33);
        System.out.println();

        System.out.println(geoff.getCapacity());
        for(int i = 0; i< geoff.getSize(); i++){
        System.out.println(geoff.getAt(i));}

    }


}
