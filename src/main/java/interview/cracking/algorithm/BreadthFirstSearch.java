package interview.cracking.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {


//    public  void dfs(Node node)
//    {
//        System.out.print(node.data + " ");
//        List neighbours=node.getNeighbours();
//        node.visited=true;
//        for (int i = 0; i < neighbours.size(); i++) {
//            Node n=neighbours.get(i);
//            if(n!=null && !n.visited)
//            {
//                dfs(n);
//            }
//        }
//    }

    // Iterative DFS using stack
//    public  void dfsUsingStack(Node node)
//    {
//        Stack<Node> stack=new  Stack<Node>();
//        stack.add(node);
//        node.visited=true;
//        while (!stack.isEmpty())
//        {
//            Node element=stack.pop();
//            System.out.print(element.data + " ");
//
//            List<Node> neighbours=element.getNeighbours();
//            for (int i = 0; i < neighbours.size(); i++) {
//                Node n=neighbours.get(i);
//                if(n!=null && !n.visited)
//                {
//                    stack.add(n);
//                    n.visited=true;
//
//                }
//            }
//        }
//    }

    public static void main(String args[]) {
        Node station1 = new Node("1", null, null);
        Node station2 = new Node("2", station1, null);
        Node station3 = new Node("3", station1, station2);
        Node station4 = new Node("4", station2, station3);
        Node station5 = new Node("5", station4, station3);
        Node station6 = new Node("6", station5, station4);

        BreadthFirstSearch bfs = new BreadthFirstSearch(station6, station1);

        if (bfs.compute())
            System.out.print("Path Found!");
    }


    Node startNode;
    Node goalNode;

    public BreadthFirstSearch(Node start, Node goalNode) {
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public boolean compute() {

        if (this.startNode.equals(goalNode)) {
            System.out.println("Goal Node Found!");
            System.out.println(startNode);
        }

        Queue<Node> queue = new LinkedList<>();
        List<Node> explored = new ArrayList<>();
        queue.add(this.startNode);
        explored.add(startNode);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (current.equals(this.goalNode)) {
                System.out.println(explored);
                return true;
            } else {
                if (current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
            }
            explored.add(current);
        }

        return false;

    }

}
