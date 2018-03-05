package ru.tisov.denis.concurrent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolTest {

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long start = System.nanoTime();
        int n = 10;
        System.out.println(forkJoinPool.invoke(new Fibonacci(n)));
        System.out.println(System.nanoTime() - start);
        start = System.nanoTime();
        System.out.println(fibonacci(n));
        System.out.println(System.nanoTime() - start);
    }

    private static int fibonacci(int n) throws InterruptedException {
        if (n <= 1) {
            Thread.sleep(100);
            return n;
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }


    private static class Fibonacci extends RecursiveTask<Integer> {

        private final int currentValue;

        private Fibonacci(int currentValue) {
            this.currentValue = currentValue;
        }

        @Override
        protected Integer compute() {
            if (currentValue <= 1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return currentValue;
            } else {
                Fibonacci fibonacci1 = new Fibonacci(currentValue - 2);
                fibonacci1.fork();
                Fibonacci fibonacci2 = new Fibonacci(currentValue - 1);
                return fibonacci2.compute() + fibonacci1.join();
            }
        }
    }

}
