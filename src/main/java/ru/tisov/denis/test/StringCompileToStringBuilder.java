package ru.tisov.denis.test;

public class StringCompileToStringBuilder {


    public String getString(int n, String someString) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + i + someString;
        }
        return result;
    }

}
