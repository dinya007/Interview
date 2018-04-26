package interview.cracking.treeandgraph;

public class PostOrderTreeTraverse implements TreeTraverse {

    @Override
    public <T> void traverse(TreeNode<T> source) {
        TreeNode<T> left = source.left;
        if (left != null) {
            traverse(left);
        }

        TreeNode<T> right = source.right;
        if (right != null) {
            traverse(right);
        }

        System.out.println(source.data);
    }

}
