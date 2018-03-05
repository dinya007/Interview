package ru.tisov.denis.concurrent;


import java.util.ArrayList;
import java.util.List;

public class InitObject {

    private volatile Integer value;

    public Integer getValue() throws InterruptedException {
        synchronized (this) {
            while (value == null) {
                System.out.println("Value is null Thread " + Thread.currentThread().getName() + " is waiting");
                wait();
            }
        }
        System.out.println("Getting value by thread " + Thread.currentThread().getName() + " : " + value);
        return value;
    }

    public void setValue(Integer value) {
        if (this.value == null) {
            System.out.println("Setting value by thread " + Thread.currentThread().getName() + " : " + value);
            synchronized (this) {
                this.value = value;
                notifyAll();
            }
        }
    }


    private static class SetThread extends Thread {

        private final int value;
        private final InitObject object;

        private SetThread(int value, InitObject object) {
            this.value = value;
            this.object = object;
        }

        @Override
        public void run() {
            object.setValue(value);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InitObject initObject = new InitObject();

        List<SetThread> threads = new ArrayList<>();

        threads.add(new SetThread(1, initObject));
        threads.add(new SetThread(2, initObject));
        threads.add(new SetThread(3, initObject));
        threads.add(new SetThread(4, initObject));
        threads.add(new SetThread(5, initObject));

        threads.forEach(Thread::start);

        System.out.println("Value: " + initObject.getValue());

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Value: " + initObject.getValue());

    }


}
