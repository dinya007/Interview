package ru.tisov.denis.puzzlers.bridge;

public class BridgeMethods {

    public static void main(String[] args) {
        new BridgeMethods().go();

    }

    private void go() {
        MyNode mn = new MyNode(5);
        Node n = mn;
        n.setData("String");
        Integer x = mn.data;
        System.out.println(x);
    }


    class Node<T> {

        T data;

        public Node(T data) {
            this.data = data;
        }

        void setData(T data) {
            this.data = data;
        }

    }


    class MyNode extends Node<Integer> {

        public MyNode(Integer data) {
            super(data);
        }

        @Override
        void setData(Integer data) {
            super.setData(data);
        }
    }



}
