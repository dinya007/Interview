package interview.cracking.algorithm;

import java.util.Arrays;
import java.util.Random;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new Random().ints(1000, 0, 100).toArray();

        System.out.println(Arrays.toString(array));

        new MergeSortAlgorithm(array).sort();

        System.out.println(Arrays.toString(array));

        System.out.println(check(array));
    }

    private static boolean check(int[] array) {
        int last = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < last) {
                return false;
            }
            last = array[i];
        }
        return true;
    }


    private static class MergeSortAlgorithm {

        private final int[] helpArray;
        private final int[] array;

        public MergeSortAlgorithm(int[] array) {
            this.array = array;
            this.helpArray = new int[array.length];
        }

        public void sort() {
            if (array == null || array.length == 0) {
                return;
            }

            sort(0, array.length - 1);
        }

        private void sort(int from, int to) {
            if (array.length < 2) {
                return;
            }

            if (from < to) {
                int middle = from + (to - from) / 2;

                sort(from, middle);

                sort(middle + 1, to);

                merge(from, middle, to);

            }

        }

        private void merge(int from, int middle, int to) {
            for (int i = from; i <= to; i++) {
                helpArray[i] = array[i];
            }

            int i = from;
            int j = middle + 1;
            int k = from;

            while (i <= middle && j <= to) {
                if (helpArray[i] <= helpArray[j]) {
                    array[k] = helpArray[i];
                    i++;
                } else {
                    array[k] = helpArray[j];
                    j++;
                }
                k++;
            }

            while (i <= middle) {
                array[k] = helpArray[i];
                k++;
                i++;
            }

        }


    }
}