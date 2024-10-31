public class BinaryTree {
    Node root;

    /*
     * Pre-order Stack Frame Diagram (for tree:   1   )
     *                                          /   \  
     *                                         2     3 
     *                                        / \      
     *                                       4   5     
     * 
     * Call Stack (grows downward):
     * +--------------------------+
     * | preOrder(1)             | → prints 1, calls left
     * +--------------------------+
     *     | preOrder(2)         | → prints 2, calls left
     *     +--------------------+
     *         | preOrder(4)    | → prints 4, calls left(null), calls right(null)
     *         +---------------+
     *     | returns to preOrder(2), calls right
     *     +--------------------+
     *         | preOrder(5)    | → prints 5, calls left(null), calls right(null)
     *         +---------------+
     * | returns to preOrder(1), calls right
     * +--------------------------+
     *     | preOrder(3)         | → prints 3, calls left(null), calls right(null)
     *     +--------------------+
     * 
     * Output: 1 2 4 5 3
     */
    public void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.data + " "); // Process the current node
        preOrderTraversal(node.left);      // Recursively traverse left subtree
        preOrderTraversal(node.right);     // Recursively traverse right subtree
    }

    /*
     * In-order Stack Frame Diagram (for tree:    1   )
     *                                          /   \  
     *                                         2     3 
     *                                        / \      
     *                                       4   5     
     * 
     * Call Stack (grows downward):
     * +--------------------------+
     * | inOrder(1)              | → calls left
     * +--------------------------+
     *     | inOrder(2)          | → calls left
     *     +--------------------+
     *         | inOrder(4)     | → calls left(null), prints 4, calls right(null)
     *         +---------------+
     *     | prints 2, calls right
     *     +--------------------+
     *         | inOrder(5)     | → calls left(null), prints 5, calls right(null)
     *         +---------------+
     * | prints 1, calls right
     * +--------------------------+
     *     | inOrder(3)          | → calls left(null), prints 3, calls right(null)
     *     +--------------------+
     * 
     * Output: 4 2 5 1 3
     */
    public void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);       // Recursively traverse left subtree
        System.out.print(node.data + " "); // Process the current node
        inOrderTraversal(node.right);      // Recursively traverse right subtree
    }
}