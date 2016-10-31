package ru.tisov.denis.collections.maps;

public class HelloWorld {


    public static void main(String[] args) {
//        new HelloWorld().go();

        String var1 = new String("Hello!").intern();
        String var2 = "Hello!";


        System.out.println(var1 == var2);


    }

    private String go() {
        synchronized (this){
            System.out.println("Hello World!");
        }
        return new String("Return value");
    }
}
