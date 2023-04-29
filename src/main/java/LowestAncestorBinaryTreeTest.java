import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LowestAncestorBinaryTreeTest {
    @Test
    public void testLowestCommonAncestorWithValidInputsLeftSubtree() {
        LowestAncestorBinaryTree tree = new LowestAncestorBinaryTree();
        LowestAncestorBinaryTree.TreeNode root = tree.new TreeNode(6);
        LowestAncestorBinaryTree.TreeNode node2 = tree.new TreeNode(2);
        LowestAncestorBinaryTree.TreeNode node8 = tree.new TreeNode(8);
        LowestAncestorBinaryTree.TreeNode node0 = tree.new TreeNode(0);
        LowestAncestorBinaryTree.TreeNode node4 = tree.new TreeNode(4);
        LowestAncestorBinaryTree.TreeNode node7 = tree.new TreeNode(7);
        LowestAncestorBinaryTree.TreeNode node9 = tree.new TreeNode(9);
        LowestAncestorBinaryTree.TreeNode node3 = tree.new TreeNode(3);
        LowestAncestorBinaryTree.TreeNode node5 = tree.new TreeNode(5);
        root.left = node2;
        root.right = node8;
        node2.left = node0;
        node2.right = node4;
        node4.left = node3;
        node4.right = node5;
        node8.left = node7;
        node8.right = node9;
        LowestAncestorBinaryTree.Solution solution = new LowestAncestorBinaryTree().new Solution();
        LowestAncestorBinaryTree.TreeNode lca = solution.lowestCommonAncestor(root, node2, node4);
        assertEquals(node2, lca);
    }

    @Test
    public void testLowestCommonAncestorWithValidInputsRightSubtree() {
        LowestAncestorBinaryTree tree = new LowestAncestorBinaryTree();
        LowestAncestorBinaryTree.TreeNode root = tree.new TreeNode(6);
        LowestAncestorBinaryTree.TreeNode node2 = tree.new TreeNode(2);
        LowestAncestorBinaryTree.TreeNode node8 = tree.new TreeNode(8);
        LowestAncestorBinaryTree.TreeNode node0 = tree.new TreeNode(0);
        LowestAncestorBinaryTree.TreeNode node4 = tree.new TreeNode(4);
        LowestAncestorBinaryTree.TreeNode node7 = tree.new TreeNode(7);
        LowestAncestorBinaryTree.TreeNode node9 = tree.new TreeNode(9);
        LowestAncestorBinaryTree.TreeNode node3 = tree.new TreeNode(3);
        LowestAncestorBinaryTree.TreeNode node5 = tree.new TreeNode(5);
        root.left = node2;
        root.right = node8;
        node2.left = node0;
        node2.right = node4;
        node4.left = node3;
        node4.right = node5;
        node8.left = node7;
        node8.right = node9;
        LowestAncestorBinaryTree.Solution solution = new LowestAncestorBinaryTree().new Solution();
        LowestAncestorBinaryTree.TreeNode lca = solution.lowestCommonAncestor(root, node7, node9);
        assertEquals(node8, lca);
    }

    @Test
    public void testLowestCommonAncestorWithRootNode() {
        LowestAncestorBinaryTree tree = new LowestAncestorBinaryTree();
        LowestAncestorBinaryTree.TreeNode root = tree.new TreeNode(6);
        LowestAncestorBinaryTree.TreeNode node2 = tree.new TreeNode(2);
        LowestAncestorBinaryTree.TreeNode node8 = tree.new TreeNode(8);
        root.left = node2;

    }
}
