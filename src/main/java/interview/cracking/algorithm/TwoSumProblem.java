package interview.cracking.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {


    public static void main(String[] args) {
        int[] array = {3, 5, 17, 2, 4, 9, 6, 1, 4};

        int[] result = findIndexes(array, 5);

        System.out.println(Arrays.toString(result));
    }

    private static int[] findIndexes(int[] array, int number) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int difference = number - array[i];

            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            } else {
                map.put(difference, i);
            }
        }

        return result;
    }

}
