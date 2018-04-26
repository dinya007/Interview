package interview.cracking.treeandgraph;

import java.util.Arrays;
import java.util.List;

public class GraphNode<T> {

    public T data;
    public List<TreeNode<T>> neighbours;

    public GraphNode(T data, TreeNode<T>... neighbours) {
        this.data = data;
        this.neighbours = Arrays.asList(neighbours);
    }


}
