package interview.cracking.algorithm;

import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 6};
        int result = findDuplicate(array);
        System.out.println(result);
    }

    private static int findDuplicate(int[] array) {
        int total = (array.length) * (array.length - 1) / 2;
        int sum = Arrays.stream(array).sum();
        return sum - total;
    }

}
