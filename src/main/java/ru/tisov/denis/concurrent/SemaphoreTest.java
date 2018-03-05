package ru.tisov.denis.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    private int sharedVaribale = 0;

    public static void main(String[] args) throws InterruptedException {
        new SemaphoreTest().go();
    }

    private void go() throws InterruptedException {
        int maxThread = 5;
        Semaphore semaphore = new Semaphore(maxThread);

        Writer writer = new Writer(semaphore);
        List<Callable<Void>> threads = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            threads.add(new Reader(semaphore));
        }
        threads.add(writer);

        ExecutorService service = Executors.newFixedThreadPool(6);


        service.invokeAll(threads);

        System.exit(0);
    }

    class Writer implements Callable<Void> {
        private final Semaphore semaphore;

        Writer(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public Void call() throws Exception {
            while (true) {
                semaphore.acquire(5);
                System.out.println("Writing... " + ++sharedVaribale);
                semaphore.release(5);
                Thread.currentThread().sleep(50);
            }
        }
    }


    class Reader implements Callable<Void> {
        private final Semaphore semaphore;

        Reader(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public Void call() throws Exception {
            while (true) {
                semaphore.acquire(1);
                System.out.println("Reading... " + sharedVaribale);
                semaphore.release(1);
                Thread.currentThread().sleep(50);
            }
        }
    }

}
