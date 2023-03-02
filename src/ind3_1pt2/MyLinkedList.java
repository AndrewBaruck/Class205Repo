package ind3_1pt2;

// Complete the implementation of your MyLinkedList class in this file


public class MyLinkedList implements MyList {
    // Implement the required fields and methods here

    private Node head = null;
    private int size = 0;

    // Do not alter the code below

    @Override
    public void addToEnd(Object o) {
        Node node = new Node();
        node.data = o;
        size++;
        if(head == null){
            head = node;
        }



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
        return size;
    }

    public MyListIterator getIterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements MyListIterator {
        Node currentNode = null;


        @Override
        public Object next() {
            if (currentNode != null)
                currentNode = currentNode.next;
            else
                currentNode = head;

            return currentNode.data;
        }

        @Override
        public boolean hasNext() {
            if (currentNode != null)
                return currentNode.next != null;
            else
                return head != null;
        }
    }

    class Node {
        public Object data = null;
        public Node next = null;
    }
}