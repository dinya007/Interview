package ru.tisov.denis.colection.listadding;

import java.util.Set;
import java.util.TreeSet;

public class ListAdding {

    public static void main(String[] args) {
        Set list = new TreeSet();
//        Set list = new HashSet();
        list.add(Integer.MAX_VALUE);
        list.add(Long.MAX_VALUE);
        list.add(new String("asd"));

        System.out.println(list);

    }

}
