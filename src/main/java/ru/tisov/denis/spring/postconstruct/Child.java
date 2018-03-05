package ru.tisov.denis.spring.postconstruct;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Child extends Parent {

    @PostConstruct
    private void init() {
        System.out.println("Child PostConstruct");
    }

    public Child() {
        System.out.println("Child constructor");
    }
}
