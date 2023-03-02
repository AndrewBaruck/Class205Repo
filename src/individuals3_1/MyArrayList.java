package individuals3_1;

// Complete the implementation of your MyArrayList class in this file


import java.util.NoSuchElementException;

public class MyArrayList implements MyList {
    // Implement the required fields and methods here

    private int capacity = 8;
    private int size = 0;
    private Object[] storage = new Object[8];

    @Override
    public void addToEnd(Object o) {
        size++;
        if(size > capacity){
            makeCapacity( 2 * size);
        }
        for (int i = 0; i<size; size++){

                storage[size-1] = o;

                break;
            }

        }


    @Override
    public void insertAt(int index, Object o) {

        if(index < 0 || index > size){
            throw new NoSuchElementException();
        }
        size++;
        if(size == capacity){
            makeCapacity(capacity * 2);
        }
        for(int i = storage.length-1; i > index; i--){
            storage[i] = storage[i-1];
        }
        storage[index] = o;

    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void removeAt(int index) {
        if(index < 0 || index >= size){
            throw new NoSuchElementException();
        }

        size--;
        for(int i = index; i < size; i++){
            storage[i] = storage[i + 1];
        }

    }

    @Override
    public Object getAt(int index) {
        if(index >= size || index < 0){
            throw new NoSuchElementException();
        }
        return storage[index];

    }

    @Override
    public int getSize() {
        return size;
    }

    // Do not alter the code below
    @Override
    public MyListIterator getIterator() {
        return new MyArrayListIterator();
    }

    //Below are the methods that I have added

    public void makeCapacity(int minCapacity){

        if(minCapacity < size || minCapacity == capacity){

        }
        else{
            if(minCapacity < 8){
                capacity = 8;
            }
            else{
                capacity = minCapacity;

            }

            Object[] storage = new Object[capacity];
            Object[] junkDrawer = this.storage;

            for(int i = 0; i < junkDrawer.length; i++){
                storage[i] = junkDrawer[i];
            }
            this.storage = storage;
        }

    }

    public void trimExcess(){
        makeCapacity(size - 1);

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