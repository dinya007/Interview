package interview.cracking.treeandgraph;

import org.junit.Before;
import org.junit.Test;

public class TreeTraverseTest {

    private TreeNode<Integer> root;

    @Before
    public void setUp() {
        TreeNode<Integer> node9 = new TreeNode<>(9, null, null);
        TreeNode<Integer> node8 = new TreeNode<>(8, null, null);
        TreeNode<Integer> node7 = new TreeNode<>(7, null, null);
        TreeNode<Integer> node6 = new TreeNode<>(6, null, null);
        TreeNode<Integer> node5 = new TreeNode<>(5, null, node9);
        TreeNode<Integer> node4 = new TreeNode<>(4, node8, null);
        TreeNode<Integer> node3 = new TreeNode<>(3, node6, node7);
        TreeNode<Integer> node2 = new TreeNode<>(2, node4, node5);

        root = new TreeNode<>(1, node2, node3);
    }

    @Test
    public void testInOrderTreeTraverse() {
        TreeTraverse treeTraverse = new InOrderTreeTraverse();

        treeTraverse.traverse(root);
    }

    @Test
    public void testPreOrderTreeTraverse() {
        TreeTraverse treeTraverse = new PreOrderTreeTraverse();

        treeTraverse.traverse(root);
    }

    @Test
    public void testPostOrderTreeTraverse() {
        TreeTraverse treeTraverse = new PostOrderTreeTraverse();

        treeTraverse.traverse(root);
    }
}