package interview.cracking.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public String stationName;
    Node leftChild;
    Node rightChild;

    public Node(String stationName, Node firstChild, Node secondChild) {
        this.stationName = stationName;
        this.leftChild = firstChild;
        this.rightChild = secondChild;
    }

    public List<Node> getChildren() {
        List<Node> childNodes = new ArrayList<>();
        if (this.leftChild != null) {
            childNodes.add(leftChild);
        }
        if (this.rightChild != null) {
            childNodes.add(rightChild);
        }
        return childNodes;
    }

    //    An auxiliary function which allows
//    us to remove any child nodes from
//    our list of child nodes.
    public boolean removeChild(Node n) {
        return false;
    }

    @Override
    public String toString() {
        return "Node{" +
                "stationName='" + stationName + '\'' +
                '}';
    }
}