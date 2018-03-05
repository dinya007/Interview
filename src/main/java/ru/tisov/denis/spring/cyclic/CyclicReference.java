package ru.tisov.denis.spring.cyclic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyclicReference {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cyclic-dependency-context.xml");
        context.getBean(ClassA.class);
    }

}
