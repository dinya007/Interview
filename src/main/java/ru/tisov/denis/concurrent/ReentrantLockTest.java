package ru.tisov.denis.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(stringSize(null));
//        new ReentrantLockTest().go();
    }

    public static int stringSize(Object s) {
        try {
            return s.toString().length();
        } catch (Exception ex) {
            return -2;
        } finally {
            return -1;
        }
    }

    private void go() throws InterruptedException {
        SharedObject sharedObject = new SharedObject();
        ReentrantLock reentrantLock = new ReentrantLock();

        Thread1 thread1 = new Thread1(sharedObject, reentrantLock);
        Thread1 thread2 = new Thread1(sharedObject, reentrantLock);

        thread1.start();
        thread2.start();

        Thread.currentThread().sleep(1000);

        thread1.interrupt();
        thread2.interrupt();
    }

    class SharedObject {
        public int count = 0;
    }

    class Thread1 extends Thread {

        private final SharedObject sharedObject;
        private final ReentrantLock lock;

        public Thread1(SharedObject sharedObject, ReentrantLock lock) {
            this.sharedObject = sharedObject;
            this.lock = lock;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Thread " + Thread.currentThread().getName() + " waiting for lock");
                    lock.tryLock(1, TimeUnit.MILLISECONDS);
//                    lock.lock();
                    System.out.println("Thread " + Thread.currentThread().getName() + " is locked");
                    ++sharedObject.count;
                } catch (InterruptedException e) {
                    System.out.println("Interrupted exception has occurred in thread: " + this.getName());
                    return;
                } finally {
                    System.out.println("Thread " + Thread.currentThread().getName() + " is unlocked");
                    if (lock.isHeldByCurrentThread()) {
                        lock.unlock();
                    }
                    if (interrupted()) {
                        return;
                    }
                }
            }
        }
    }

}
