package ru.tisov.denis.cloneable;

public class Child extends Parent implements Cloneable {

    private int field0 = 10;

    @Override
    protected Child clone() throws CloneNotSupportedException {
        return (Child) super.clone();
    }

    @Override
    public String toString() {
        return "Child{" +
                "field0=" + field0 +
                '}';
    }
}
