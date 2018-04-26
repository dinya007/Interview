package interview.cracking.treeandgraph;

public class IsTreeBalanced {

    public static <T> boolean isBalanced(TreeNode<T> source) {
        if (source == null) {
            return true;
        }

        return (getMaxDepth(source) - getMinDepth(source)) <= 1;
    }

    private static <T> int getMaxDepth(TreeNode<T> node) {
        if (node == null) {
            return 1;
        }

        return Math.max(getMaxDepth(node.left), getMaxDepth(node.right)) + 1;
    }

    private static <T> int getMinDepth(TreeNode<T> node) {
        if (node == null) {
            return 1;
        }

        return Math.min(getMinDepth(node.left), getMinDepth(node.right)) + 1;
    }

}
