package ru.tisov.denis.colection.generics;

import java.util.ArrayList;
import java.util.List;

public class WIldcards {

    public static void main(String[] args) {
        ArrayList<? extends Number> numbers = new ArrayList<>();
        numbers.add(null);

        ArrayList<? super Number> numbers2 = new ArrayList<>();
        numbers2.add(0);

//        Set<? super Number> numberSet = new TreeSet<>();
//        numberSet.add(new Integer(0));
//        numberSet.add(new Long(2));

        List<Number> numberList = new ArrayList<>();
        numberList.add(new Integer(0));
        numberList.add(new Long(4));

        System.out.println(numberList);

    }

}
