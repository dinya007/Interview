package ru.tisov.denis.hierarchy.inheritance;

import java.util.Date;

public class FinalNull {


    public static void main(String[] args) {
        new FinalNull().go();
    }

    private void go() {
        new Child().printDate();
    }

    class Parent {

        public Parent() {
            printDate();
        }

        protected void printDate() {

        }

    }

    class Child extends Parent {

        private final Date date;

        Child() {
            date = new Date();
        }

        @Override
        protected void printDate() {
            System.out.println(date);
        }
    }


}
