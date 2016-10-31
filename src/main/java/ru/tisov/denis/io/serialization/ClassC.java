package ru.tisov.denis.io.serialization;

import java.io.Serializable;

public class ClassC implements Serializable {
    private final String someField;

    public ClassC() {
        someField = "SomeField";
    }

    @Override
    public String toString() {
        return "ClassC{" +
                "someField='" + someField + '\'' +
                '}';
    }
}
