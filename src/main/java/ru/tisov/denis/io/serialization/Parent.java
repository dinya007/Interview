package ru.tisov.denis.io.serialization;

class Parent {
    final String parentField;

    public Parent() {
        System.out.println("Parent constructor");
        parentField = "valueFromConstructorA";
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentField='" + parentField + '\'' +
                '}';
    }
}