package ru.tisov.denis.threads;

import java.lang.*;
import java.lang.InterruptedException;
import java.util.concurrent.atomic.AtomicInteger;

public class WaitTest {

    public static void main(String[] args) {
        new WaitTest().go();
    }

    private void go() {
        Owner owner = new Owner();
        Waiter1 waiter1 = new Waiter1(owner);
        Waiter2 waiter2 = new Waiter2(owner);

        System.out.println("Main thread " + owner.syncMethod());
        waiter1.start();
        waiter2.start();
    }

    class Owner {

        public AtomicInteger integer = new AtomicInteger(0);

        public synchronized Object syncMethod() {
            try {
                Thread.currentThread().sleep(1000);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
            return integer.incrementAndGet();
        }
    }

    class Waiter1 extends Thread {

        private final Owner owner;

        Waiter1(Owner owner) {
            this.owner = owner;
        }

        @Override
        public void run() {
            if (owner.integer.get() == 0) {
                try {
                    owner.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Waiter1 " + owner.syncMethod());
        }
    }

    class Waiter2 extends Thread {

        private final Owner owner;

        Waiter2(Owner owner) {
            this.owner = owner;
        }

        @Override
        public void run() {
            if (owner.integer.get() == 0) {
                try {
                    owner.wait(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Waiter2 " + owner.syncMethod());
        }
    }


}
