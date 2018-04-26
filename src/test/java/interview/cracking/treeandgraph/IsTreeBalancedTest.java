package interview.cracking.treeandgraph;

import org.junit.Assert;
import org.junit.Test;

public class IsTreeBalancedTest {

    @Test
    public void testIsBalancedSuccess() {
        TreeNode<Integer> node5 = new TreeNode<>(5, null, null);
        TreeNode<Integer> node4 = new TreeNode<>(4, null, null);
        TreeNode<Integer> node3 = new TreeNode<>(3, null, null);
        TreeNode<Integer> node2 = new TreeNode<>(2, node4, node5);
        TreeNode<Integer> root = new TreeNode<>(1, node2, node3);

        Assert.assertTrue(IsTreeBalanced.isBalanced(root));
    }

    @Test
    public void testIsBalancedFail() {
        TreeNode<Integer> node6 = new TreeNode<>(6, null, null);
        TreeNode<Integer> node5 = new TreeNode<>(5, null, node6);
        TreeNode<Integer> node4 = new TreeNode<>(4, null, null);
        TreeNode<Integer> node3 = new TreeNode<>(3, null, null);
        TreeNode<Integer> node2 = new TreeNode<>(2, node4, node5);
        TreeNode<Integer> root = new TreeNode<>(1, node2, node3);

        Assert.assertFalse(IsTreeBalanced.isBalanced(root));
    }

}