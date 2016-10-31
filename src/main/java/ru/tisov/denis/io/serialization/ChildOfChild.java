package ru.tisov.denis.io.serialization;

public class ChildOfChild extends Child {

    final String childOfChildField;

    public ChildOfChild() {
        System.out.println("ChildOfChildCOnstructor");
        childOfChildField = "childOfChildFieldFilledInConstructor";
    }
}
