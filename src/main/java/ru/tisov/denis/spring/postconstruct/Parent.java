package ru.tisov.denis.spring.postconstruct;

import javax.annotation.PostConstruct;

public class Parent {

    @PostConstruct
    private void init() {
        System.out.println("Parent PostConstruct");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }
}
