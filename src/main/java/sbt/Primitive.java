package sbt;

import java.util.ArrayList;
import java.util.List;

public class Primitive {

    public static void main(String[] args) {
        System.out.println((int) 5L);
        System.out.println((long) 5);
        System.out.println((long) '5');

        List<Object> list = null;
        if (list != null && list.size() > 0) {
            System.out.println(list.size());
        }

        System.out.println(new Integer(Integer.MAX_VALUE + 1).equals(Integer.MIN_VALUE));

    }

}
