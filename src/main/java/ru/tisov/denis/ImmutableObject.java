package ru.tisov.denis;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImmutableObject  <T>  {



    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10);


        ExecutorService service = Executors.newFixedThreadPool(5);
    }


    public ImmutableObject(T person) {
    }


}
