package ru.tisov.denis.cloneable;

public class Parent {

    private int field0 = 5;

    @Override
    protected Parent clone() throws CloneNotSupportedException {
        return (Parent) super.clone();
    }

    @Override
    public String toString() {
        return "Parent{" +
                "field0=" + field0 +
                '}';
    }
}
