package binarytree;

public class BinaryTree {

    public Node root;

    /*
        the method below will call itself recursively
        to fill in the appropriate node
     */
    public Node insertNode(Node current, int key) {
        /*
            this checks to see if the node we're working with
            is null, and returns a new binarytree.Node if it is.
         */
        if (current == null) {
            return new Node(key);
        } else if (key < current.getKey()) {
            /*
                this checks to see if the key is lesser
                than the current key, and places it to the left
             */
            current.setLeftNode(insertNode(current.getLeftNode(), key));
        } else if (key > current.getKey()) {
            /*
                this checks to see if the key is greater
                than the current key, and places it to the right
             */
            current.setRightNode(insertNode(current.getRightNode(), key));
        } else {
            return current;
        }

        return current;
    }

    public void add(int key) {
        root = insertNode(root, key);
    }

    @Override
    public String toString() {
        return "binarytree.BinaryTree{" +
                "root=" + root +
                '}';
    }


}
