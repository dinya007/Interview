package ru.tisov.denis.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockTest {

    public static void main(String[] args) throws InterruptedException {
        new ReentrantReadWriteLockTest().go();
    }

    private void go() throws InterruptedException {
        SharedObject sharedObject = new SharedObject();
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

        Writer writer = new Writer(sharedObject, writeLock);

        ExecutorService service = Executors.newFixedThreadPool(11);

        List<Callable<Void>> threads = new ArrayList<>(11);
        threads.add(toCallable(writer));

        for (int i = 0; i < 10; i++) {
            threads.add(toCallable(new Reader(sharedObject, readLock)));
        }

        List<Future<Void>> futures = service.invokeAll(threads);

        futures.forEach(future -> future.cancel(true));

        Runtime.getRuntime().exit(0);
    }

    private Callable<Void> toCallable(final Runnable runnable) {
        return () -> {
            runnable.run();
            return null;
        };
    }

    class SharedObject {
        public int count = 0;
    }

    class Writer extends Thread {

        private final SharedObject sharedObject;
        private final ReentrantReadWriteLock.WriteLock lock;

        public Writer(SharedObject sharedObject, ReentrantReadWriteLock.WriteLock lock) {
            this.sharedObject = sharedObject;
            this.lock = lock;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    lock.tryLock(1000, TimeUnit.MILLISECONDS);
                    System.out.println("Writer is locked");
                    ++sharedObject.count;
                } catch (InterruptedException e) {
                    System.out.println("Interrupted exception has occurred in thread: " + this.getName());
                    return;
                } finally {
                    System.out.println("Writer is unlocked");
                    lock.unlock();
                    if (Thread.currentThread().interrupted()) {
                        return;
                    }
                }
            }
        }
    }

    class Reader extends Thread {

        private final SharedObject sharedObject;
        private final ReentrantReadWriteLock.ReadLock lock;

        public Reader(SharedObject sharedObject, ReentrantReadWriteLock.ReadLock lock) {
            this.sharedObject = sharedObject;
            this.lock = lock;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    lock.tryLock(1000, TimeUnit.MILLISECONDS);
                    System.out.println("Read is locked");
                    System.out.println(sharedObject.count);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted exception has occurred in thread: " + this.getName());
                    return;
                } finally {
                    System.out.println("Read is unlocked");
                    lock.unlock();
                    if (Thread.currentThread().interrupted()) {
                        return;
                    }
                }
            }
        }
    }

}
