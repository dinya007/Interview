package ru.tisov.denis.concurrency.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentarntLockTest {

    public static void main(String[] args) throws InterruptedException {
        new ReentarntLockTest().go();
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
                    lock.tryLock(1000, TimeUnit.MILLISECONDS);
                    System.out.println("Thread 1 is locked");
                    ++sharedObject.count;
                } catch (InterruptedException e) {
                    System.out.println("Interrupted exception has occurred in thread: " + this.getName());
                    return;
                } finally {
                    System.out.println("Thread 2 is unlocked");
                    lock.unlock();
                    if (Thread.currentThread().interrupted()) {
                        return;
                    }
                }
            }
        }
    }

}
