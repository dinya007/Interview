package interview.cracking.arraysandstrings;


public class RemoveDuplicatesFromLinkedList {

    public static void main(String[] args) {
        Node<Integer> node6 = new Node<>(7);
        Node<Integer> node5 = new Node<>(10);
        Node<Integer> node4 = new Node<>(8);
        Node<Integer> node3 = new Node<>(7);
        Node<Integer> node2 = new Node<>(1);
        Node<Integer> node1 = new Node<>(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        removeDuplicates(node1);

        print(node1);

        // a(1) -> b(1) -> c(7) -> d(8)
    }

    private static void print(Node<Integer> head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static <T> void removeDuplicates(Node<T> head) {
        if (head == null || head.next == null) {
            return;
        }

        Node<T> current = head.next;
        Node<T> previous = head;

        while (current != null) {
            Node<T> runner = head;
            while (runner != current) {
                if (runner.data.equals(current.data)) {
                    previous.next = current.next;
                    current = current.next;
                    break;
                }
                runner = runner.next;
            }
            if (runner == current) {
                previous = current;
                current = current.next;
            }
        }
    }

    private static class Node<T> {

        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

}
