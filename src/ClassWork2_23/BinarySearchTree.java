package ClassWork2_23;

class BinarySearchTree {
    class Node{
        int key;

        Node left, right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree(){
        root = null;
    }

    public void insert(int key){
        root = insertKey(root, key);
    }

    private Node insertKey(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertKey(root.left, key);
        }
        else if(key > root.key){
            root.right = insertKey(root.right, key);
        }
        return root;
    }

    int minValue(Node root){
        int minV = root.key;

        while(root.left != null){
            minV = root.left.key;
            root = root.left;
        }
       return minV;
    }

    int maxValue(Node root){
        int maxV = root.key;

        while(root.right != null){
            maxV = root.right.key;
            root = root.right;
        }
        return maxV;
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key){
        if(root == null){
            return root;
        }

        if(key < root.key){
            root.left = deleteRec(root.left, key);
        }
        else if(key > root.key){
            root.right = deleteRec(root.right, key);
        }
        else{
            if(root.left == null)
        {
            return root.right;
        }
            else if (root.right == null){
                return root.left;
            }

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
    }
        return root;
    }

}
