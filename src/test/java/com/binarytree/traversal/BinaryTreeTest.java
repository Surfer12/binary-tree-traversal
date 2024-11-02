package com.binarytree.traversal;

import org.mockito.Before;
import org.mockito.Test;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;

public class BinaryTreeTest {
   private BinaryTree tree;

   @Before
   public void setUp() {
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
   public void testPreOrderTraversal() {
      List<Integer> result = tree.preOrderTraversal();
      List<Integer> expected = Arrays.asList(4, 2, 1, 3, 6, 5, 7);
      assert result.equals(expected) : "Pre-order traversal failed";
   }

   @Test
   public void testInOrderTraversal() {
      List<Integer> result = tree.inOrderTraversal();
      List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
      assert result.equals(expected) : "In-order traversal failed";
   }
}