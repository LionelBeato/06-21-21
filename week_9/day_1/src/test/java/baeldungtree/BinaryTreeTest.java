package baeldungtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {


    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = BinaryTree.createBinaryTree();

        assertTrue(bt.containsNode(5));
        assertTrue(bt.containsNode(4));
        assertFalse(bt.containsNode(1));

    }

    @Test
    public void testOrder() {
        BinaryTree bt = BinaryTree.createBinaryTree();
        System.out.println("\ncalling in order method\n");
        bt.traverseInOrder(bt.root);
        System.out.println("\ncalling pre-order method\n");
        bt.traversePreOrder(bt.root);
        System.out.println("\ncalling level-order method\n");
        bt.traverseLevelOrder();




    }



}