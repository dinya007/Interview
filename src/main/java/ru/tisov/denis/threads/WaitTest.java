package ru.tisov.denis.threads;

import java.lang.InterruptedException;
import java.util.concurrent.atomic.AtomicInteger;

public class WaitTest {

    public static void main(String[] args) {

        Object monitor = new Object();
        AtomicInteger number = new AtomicInteger();

        new Thread(() -> {
            synchronized (monitor) {
                number.incrementAndGet();
                monitor.notifyAll();
            }
        }).start();

        new Thread(() -> {
            try {
                synchronized (monitor) {
                    while (number.get() == 0) {
                        monitor.wait();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            System.out.println(number.get());
        }).start();


    }

}
