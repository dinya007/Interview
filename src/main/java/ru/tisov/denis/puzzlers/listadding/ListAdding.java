package ru.tisov.denis.puzzlers.listadding;

import java.util.Set;
import java.util.TreeSet;

public class ListAdding {

    public static void main(String[] args) {
        Set list = new TreeSet<Number>();
        list.add(Integer.MAX_VALUE);
        list.add(Long.MAX_VALUE);
        list.add(new String("asd"));

        System.out.println(list);

    }

}
