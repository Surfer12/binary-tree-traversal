import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

	@Test
	public void testAddNode() {
		BinaryTree tree = new BinaryTree();
		tree.addNode(5);
		assertNotNull(tree.findNode(5));
	}

	// Add more test methods as needed
}