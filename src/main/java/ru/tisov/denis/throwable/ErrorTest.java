package ru.tisov.denis.throwable;

public class ErrorTest {

    public static void main(String[] args) {
        new ErrorTest().go();
    }

    private void go() {

        try {
            throwError();
        } catch (Error error) {
            System.out.println("Error was catched");
        }

    }

    private void throwError() throws Error {
        throw new Error();
    }

}
