package ru.tisov.denis.io.serialization;

import java.io.Serializable;

class Child extends Parent implements Serializable {
    final String childField;
    final ClassC classC;

    public Child() {
        System.out.println("Child constructor");
        childField = "valueFromConstructorB";
        classC = new ClassC();
    }

    @Override
    public String toString() {
        return super.toString() + "\nChild{" +
                "childField='" + childField + '\'' +
                ", classC=" + classC +
                '}';
    }
}