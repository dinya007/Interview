package interview.cracking.algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new Random().ints(100, 0, 1000).toArray();

//        sort(array, 0, array.length - 1);

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(new QuickSortAlgorithm(array, 0, array.length - 1));

        System.out.println(Arrays.toString(array));

        System.out.println(Utils.checkSort(array));
    }

    private static class QuickSortAlgorithm extends RecursiveTask<Void> {


        private final int[] array;
        private final int from;
        private final int to;

        private QuickSortAlgorithm(int[] array, int from, int to) {
            this.array = array;
            this.from = from;
            this.to = to;
        }

        @Override
        protected Void compute() {
            if (array == null || array.length == 0) {
                return null;
            }

            int leftMarker = from;
            int rightMarker = to;
            int pivotValue = array[(from + ((to - from) / 2))];

            while (leftMarker <= rightMarker) {
                while (array[leftMarker] < pivotValue) {
                    leftMarker++;
                }

                while (array[rightMarker] > pivotValue) {
                    rightMarker--;
                }

                if (leftMarker <= rightMarker) {
                    int temp = array[rightMarker];
                    array[rightMarker] = array[leftMarker];
                    array[leftMarker] = temp;
                    leftMarker++;
                    rightMarker--;
                }
            }

            ForkJoinTask<Void> fork = null;
            if (leftMarker < to) {
                fork = new QuickSortAlgorithm(array, leftMarker, to).fork();
            }

            QuickSortAlgorithm compute = null;
            if (rightMarker > from) {
                compute = new QuickSortAlgorithm(array, from, rightMarker);
            }

            if (compute != null) {
                compute.compute();
            }

            if (fork != null) {
                fork.join();
            }

            return null;
        }
    }


    private static void sort(int[] array, int from, int to) {
        if (array == null || array.length == 0) {
            return;
        }

        int leftMarker = from;
        int rightMarker = to;
        int pivotValue = array[(from + ((to - from) / 2))];

        while (leftMarker <= rightMarker) {
            while (array[leftMarker] < pivotValue) {
                leftMarker++;
            }

            while (array[rightMarker] > pivotValue) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                int temp = array[rightMarker];
                array[rightMarker] = array[leftMarker];
                array[leftMarker] = temp;
                leftMarker++;
                rightMarker--;
            }
        }

        if (leftMarker < to) {
            sort(array, leftMarker, to);
        }

        if (rightMarker > from) {
            sort(array, from, rightMarker);
        }

    }

}
