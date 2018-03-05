package ru.tisov.denis.colection.pecs;

import java.util.ArrayList;
import java.util.List;

public class PecsTest {

    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();

        List<? super Number> list2 = new ArrayList<>();

        Number number = new Integer(0);

        list2.add(new Integer(0));

        list2.add(number);

//        list.add(number);


    }

}
