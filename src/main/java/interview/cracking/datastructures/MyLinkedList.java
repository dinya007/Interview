package interview.cracking.datastructures;

public class MyLinkedList<T> {

    protected Node<T> firstNode;
    protected Node<T> lastNode;
    private int size;


    public MyLinkedList() {
    }

    public T add(T element) {
        Node<T> newNode = new Node<>(element);
        ++size;

        if (firstNode == null) firstNode = newNode;

        if (lastNode != null) {
            lastNode.setNextNode(newNode);
        }else {
            lastNode = newNode;
        }

        return lastNode.getValue();
    }

    public int size() {
        return size;
    }

    public void reverse() {
        if (firstNode == null || firstNode.nextNode == null) return;

        Node<T> prevNode = firstNode;
        Node<T> currentNode = firstNode.nextNode;
        lastNode = firstNode;
        lastNode.setNextNode(null);
        for (int i = 1; i < size; i++) {
            Node<T> nextNode = currentNode.nextNode;
            currentNode.setNextNode(prevNode);
            firstNode = currentNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

    }

    public T get(int index) {
        for (int i = 0; i <= index; i++) {
            Node<T> node = firstNode.getNextNode();
            if (i == index) return node.getValue();
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean contains(T element) {
        if (firstNode == null) return false;

        Node<T> node = firstNode;
        while (firstNode != null) {
            if (node.getValue().equals(element)) return true;
            node = firstNode.getNextNode();
        }

        return false;
    }

    public int indexOf(T element) {
        if (firstNode == null) return -1;

        Node<T> node = firstNode;
        int index = 0;
        while (firstNode != null) {
            ++index;
            if (node.getValue().equals(element)) return index;
            node = firstNode.getNextNode();
        }

        return -1;
    }

    public void print() {
        if (firstNode != null) {
            StringBuilder result = new StringBuilder();
            Node<T> node = firstNode;
            while (node != null) {
                result.append(node.value.toString()).append(" ");
                node = node.getNextNode();
            }
            System.out.println(result.toString().trim());
        }
    }

    protected static class Node<T> {

        private Node<T> nextNode;
        private final T value;

        public Node(T value) {
            this.value = value;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }

        public T getValue() {
            return value;
        }
    }

}
