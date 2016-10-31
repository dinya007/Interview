package ru.tisov.denis.concurrency.forkjoinpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTest {


    public static void main(String[] args) {
        new ForkJoinTest().go();
    }

    private void go() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();


        List<RecursiveTask<Integer>> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i, new MyRecursiveTask(0));
            Integer result = forkJoinPool.invoke(list.get(i));
        }

    }

    class MyRecursiveTask extends RecursiveTask<Integer> {

        private int count;

        MyRecursiveTask(int count) {
            this.count = count;
        }

        @Override
        protected Integer compute() {
            return ++count;
        }
    }



}
