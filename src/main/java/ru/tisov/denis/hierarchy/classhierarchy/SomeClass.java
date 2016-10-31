package ru.tisov.denis.hierarchy.classhierarchy;

public class SomeClass {

    public static void main(String[] args) {
        new SomeClass().go();
    }

    private void go() {
        Parent parent = new Parent();
        Parent child = new Child();

        call(parent);
        call(child);
    }


    public void call(Parent parent) {
        System.out.println("Parent are going to be called");
        parent.call();
    }

    public void call(Child child) {
        System.out.println("Child are going to be called");
        child.call();
    }

}
