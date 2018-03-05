package interview.cracking.datastructures.hashtable1;

public class HashTableLinkedList<T> extends MyLinkedList<T> {

    public T put(T value) {
        if (firstNode == null) return add(value);

        Node<T> node = firstNode;
        while (node != null) {

            if (node.getValue().equals(value)){
                T nodeValue = node.getValue();
                T returnValue = nodeValue;
                nodeValue = value;
                return returnValue;
            }

            if (firstNode.getNextNode() == null) break;
            node = firstNode.getNextNode();
        }

        node.setNextNode(new Node<T>(value));
        return null;

    }

    public T get(T value) {
        if (firstNode == null) return null;

        Node<T> node = firstNode;
        while (node != null) {
            if (node.getValue().equals(value)) return node.getValue();
            node = firstNode.getNextNode();
        }

        return null;
    }

}
