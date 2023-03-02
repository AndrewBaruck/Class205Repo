package individuals3_1;

// Complete the implementation of your MyArrayList class in this file


public class MyArrayList implements MyList {
    // Implement the required fields and methods here

    private int capacity = 8;
    private int size = 0;
    private Object[] storage = new Object[8];

    @Override
    public void addToEnd(Object o) {

    }

    @Override
    public void insertAt(int index, Object o) {

    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public Object getAt(int index) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    // Do not alter the code below
    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator();
    }

    //Below are the methods that I have added

    public static void makeCapacity(int minCapacity){


    }

    public static void trimExcess(){


    }

    private class MyArrayListIterator implements MyListIterator {
        int currentIndex = -1;

        @Override
        public Object next() {
            ++currentIndex;
            return storage[currentIndex];
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size - 1;
        }
    }
}