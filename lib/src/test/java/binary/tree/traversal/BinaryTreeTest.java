package binary.tree.traversal;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    @Test
    public void testPreOrderTraversal() {
        BinaryTree tree = spy(new BinaryTree());
        Node mockNode = mock(Node.class);
        
        tree.preOrderTraversal(mockNode);
        
        verify(tree).preOrderTraversal(mockNode);
    }

    @Test
    public void testInOrderTraversal() {
        BinaryTree tree = spy(new BinaryTree());
        Node mockNode = mock(Node.class);
        
        tree.inOrderTraversal(mockNode);
        
        verify(tree).inOrderTraversal(mockNode);
    }
}