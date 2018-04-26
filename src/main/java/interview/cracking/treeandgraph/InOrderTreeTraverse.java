package interview.cracking.treeandgraph;

public class InOrderTreeTraverse implements TreeTraverse {

    @Override
    public <T> void traverse(TreeNode<T> source) {
        TreeNode<T> left = source.left;
        if (left != null) {
            traverse(left);
        }

        System.out.println(source.data);

        TreeNode<T> right = source.right;
        if (right != null) {
            traverse(right);
        }
    }

}
