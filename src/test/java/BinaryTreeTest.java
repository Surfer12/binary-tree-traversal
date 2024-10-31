import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;


public class BinaryTreeTest {
    public void testPreOrderTraversal() {
        // Create a spy of the BinaryTree to monitor method calls
        BinaryTree tree = spy(new BinaryTree());
        // Mock a Node object to simulate a real node
        Node mockNode = mock(Node.class);

        // Invoke the preOrderTraversal method
        tree.preOrderTraversal(mockNode);

        // Verify that preOrderTraversal was called with the mock node
        verify(tree).preOrderTraversal(mockNode);
    }

    public void testInOrderTraversal() {
        // Create a spy of the BinaryTree
        BinaryTree tree = spy(new BinaryTree());
        // Mock a Node object
        Node mockNode = mock(Node.class);

        // Invoke the inOrderTraversal method
        tree.inOrderTraversal(mockNode);

        // Verify that inOrderTraversal was called with the mock node
        verify(tree).inOrderTraversal(mockNode);
    }
}