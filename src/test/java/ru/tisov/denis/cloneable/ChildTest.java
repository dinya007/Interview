package ru.tisov.denis.cloneable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChildTest {

    @Test
    public void cloneTest() throws Exception {
        Child child = new Child();

        Child childClone = child.clone();

        System.out.println(child);
        System.out.println(childClone);
    }

}
