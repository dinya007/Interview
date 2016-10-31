package ru.tisov.denis.classobject;

public class TestObject {

    class SomeClass {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        new TestObject().go();
    }

    private void go() throws CloneNotSupportedException {
        SomeClass someClass = new SomeClass();
        Object result = someClass.clone();
        System.out.println(result);
    }

}
