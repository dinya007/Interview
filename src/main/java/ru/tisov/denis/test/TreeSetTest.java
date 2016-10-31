package ru.tisov.denis.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        Set set = new TreeSet<Number>();

        set.add(new Integer(4));
        set.add(new Long(4));
        set.add(new String("asdasd"));

        set.forEach(System.out::println);
    }

}
