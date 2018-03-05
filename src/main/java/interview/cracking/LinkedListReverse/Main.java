package interview.cracking.LinkedListReverse;

import interview.cracking.datastructures.hashtable1.MyLinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.print();

        linkedList.reverse();
        linkedList.print();
    }

}
