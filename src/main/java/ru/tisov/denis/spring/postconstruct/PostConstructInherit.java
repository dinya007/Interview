package ru.tisov.denis.spring.postconstruct;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostConstructInherit {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("post-construct-inherit-context.xml");
        context.getBean(Child.class);
    }

}
