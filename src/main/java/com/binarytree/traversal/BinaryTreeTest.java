package com.binarytree.traversal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    private BinaryTree tree;

    @BeforeEach
    void setUp() {
        tree = new BinaryTree();
        // Create a sample tree: 4,2,6,1,3,5,7
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
    }

    @Test
    void testPreOrderTraversal() {
        List<Integer> result = tree.preOrderTraversal();
        assertEquals(List.of(4,2,1,3,6,5,7), result);
    }

    @Test
    void testInOrderTraversal() {
        List<Integer> result = tree.inOrderTraversal();
        assertEquals(List.of(1,2,3,4,5,6,7), result);
    }
} 