package ru.tisov.denis.reflection;

import java.lang.reflect.Field;

public class ChangeFinalFieldExample {


    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        new ChangeFinalFieldExample().setInt();
        new ChangeFinalFieldExample().setStringBuilder();
    }

    private void setInt() throws IllegalAccessException, NoSuchFieldException {
        ClassA classA = new ClassA();

        System.out.println("Before write a: " + classA.getA());

        Field field = classA.getClass().getDeclaredField("a");
        field.setAccessible(true);
        field.set(classA, 10);

        System.out.println("After write a: " + classA.getA());

    }

    private void setStringBuilder() throws NoSuchFieldException, IllegalAccessException {
        ClassB classB = new ClassB();

        System.out.println("Before write value: " + classB.getValue());

        Field field = classB.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(classB, new StringBuilder("10"));

        System.out.println("After write value: " + classB.getValue());
    }

    class ClassA {

//        That's different case that described in http://stackoverflow.com/questions/4516381/changing-private-final-fields-via-reflection
        private final int a = 5;

//        private final int a;

        ClassA() {
//            a = 5;
        }


        public int getA() {
            return a;
        }
    }

    class ClassB {
        private final StringBuilder value = new StringBuilder("init value");

//        private final StringBuilder value;
//        public ClassB() {
//            value= new StringBuilder("init value");
//        }

        public StringBuilder getValue() {
            return value;
        }
    }

}

