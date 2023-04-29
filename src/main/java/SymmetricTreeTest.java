import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SymmetricTreeTest {
        @Test
        public void testIsSymmetric() {
                SymmetricTree s = new SymmetricTree();
                SymmetricTree.Solution solution = s.new Solution();

                // Test case 1
                SymmetricTree.TreeNode root1 = s.new TreeNode(1);
                root1.left = s.new TreeNode(2, s.new TreeNode(3), s.new TreeNode(4));
                root1.right = s.new TreeNode(2, s.new TreeNode(4), s.new TreeNode(3));
                boolean expected1 = true;
                boolean result1 = solution.isSymmetric(root1);
                assertEquals(expected1, result1);

                // Test case 2
                SymmetricTree.TreeNode root2 = s.new TreeNode(1);
                root2.left = s.new TreeNode(2, null, s.new TreeNode(3));
                root2.right = s.new TreeNode(2, null, s.new TreeNode(3));
                boolean expected2 = false;
                boolean result2 = solution.isSymmetric(root2);
                assertEquals(expected2, result2);

                // Test case 3
                SymmetricTree.TreeNode root3 = s.new TreeNode(1);
                boolean expected3 = true;
                boolean result3 = solution.isSymmetric(root3);
                assertEquals(expected3, result3);
        }
}
