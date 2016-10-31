package ru.tisov.denis.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {
        new GenericTest().go();

    }

    private void go() {

    }

    class Parent<T> {

        private T value;

        public void set(T a) {
            value = a;
        }
    }

    class Child extends Parent<Integer> {
        @Override
        public void set(Integer a) {
            super.set(a);
        }
    }



}
