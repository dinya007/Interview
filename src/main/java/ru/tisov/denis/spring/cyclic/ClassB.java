package ru.tisov.denis.spring.cyclic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

    @Autowired
    private ClassA classA;

    public ClassB() {
    }

}
