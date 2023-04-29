import org.junit.Test;
import static org.junit.Assert.*;

public class MaxDepthBinaryTreeTest {

    @Test
    public void testMaxDepthWithNullTree() {
        MaxDepthBinaryTree.TreeNode root = null;
        MaxDepthBinaryTree.Solution solution = new MaxDepthBinaryTree().new Solution();
        int expected = 0;
        int result = solution.maxDepth(root);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxDepthWithSingleNodeTree() {
        MaxDepthBinaryTree.TreeNode root = new MaxDepthBinaryTree().new TreeNode(5);
        MaxDepthBinaryTree.Solution solution = new MaxDepthBinaryTree().new Solution();
        int expected = 1;
        int result = solution.maxDepth(root);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxDepthWithFullBinaryTree() {
        MaxDepthBinaryTree.TreeNode root = new MaxDepthBinaryTree().new TreeNode(1);
        root.left = new MaxDepthBinaryTree().new TreeNode(2);
        root.right = new MaxDepthBinaryTree().new TreeNode(3);
        root.left.left = new MaxDepthBinaryTree().new TreeNode(4);
        root.left.right = new MaxDepthBinaryTree().new TreeNode(5);
        root.right.left = new MaxDepthBinaryTree().new TreeNode(6);
        root.right.right = new MaxDepthBinaryTree().new TreeNode(7);
        MaxDepthBinaryTree.Solution solution = new MaxDepthBinaryTree().new Solution();
        int expected = 3;
        int result = solution.maxDepth(root);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxDepthWithSkewedBinaryTree() {
        MaxDepthBinaryTree.TreeNode root = new MaxDepthBinaryTree().new TreeNode(1);
        root.right = new MaxDepthBinaryTree().new TreeNode(2);
        root.right.right = new MaxDepthBinaryTree().new TreeNode(3);
        root.right.right.right = new MaxDepthBinaryTree().new TreeNode(4);
        root.right.right.right.right = new MaxDepthBinaryTree().new TreeNode(5);
        MaxDepthBinaryTree.Solution solution = new MaxDepthBinaryTree().new Solution();
        int expected = 5;
        int result = solution.maxDepth(root);
        assertEquals(expected, result);
    }
}
