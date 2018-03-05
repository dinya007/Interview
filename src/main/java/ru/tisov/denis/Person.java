package ru.tisov.denis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
        new ArrayList<>();
    }

    public static void main(String[] args) {

        String str1 = "str1";
        StringBuilder str2 = new StringBuilder("str1");

        System.out.println(str2.equals(str1));
    }

    static class InnerClass {
        static String field;

    }

    private class NotStaticInner {

        public void method() {
            TreeSet<Object> objects = new TreeSet<>(new Comparator<Object>() {
                @Override
                public int compare(Object o1, Object o2) {
                    return 0;
                }
            });

            class MethodClass {

            }

            MethodClass methodClass = new MethodClass();


        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
