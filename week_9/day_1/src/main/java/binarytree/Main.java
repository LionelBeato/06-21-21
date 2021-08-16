package binarytree;

public class Main {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        /*
            here we set up a standard, unordered array
         */
        int[] nodes = {7, 12, 4, 8, 6, 13, 14, 78, 24, 2};

        int[] ordered = {1, 2, 3, 4, 5, 6};

        for (int n : ordered ) {
            bt.add(n);
        }

        System.out.println(bt);

    }

}
