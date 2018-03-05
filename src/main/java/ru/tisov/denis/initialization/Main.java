package ru.tisov.denis.initialization;

public class Main {

    static {
        int b = initialize("static block");
    }

    private static int a = initialize("static field");

    {
        int d = initialize("object block");
    }

    private int c = initialize("object field");


    public Main() {
        int e = initialize("Constructor field");
    }



    private static int initialize(String field) {
        System.out.println(field);
        return 0;
    }

    public static void main(String[] args) {
        new Main();
    }

}
