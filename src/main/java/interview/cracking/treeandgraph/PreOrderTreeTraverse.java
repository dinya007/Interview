package interview.cracking.treeandgraph;

public class PreOrderTreeTraverse implements TreeTraverse {

    @Override
    public <T> void traverse(TreeNode<T> source) {
        System.out.println(source.data);

        TreeNode<T> left = source.left;
        if (left != null) {
            traverse(left);
        }

        TreeNode<T> right = source.right;
        if (right != null) {
            traverse(right);
        }
    }
}
