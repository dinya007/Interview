package interview.cracking.algorithm;

public class MissingNumber {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6};
        int result = findMissing(array);
        System.out.println(result);
    }

    private static int findMissing(int[] array) {
        int total = (array.length + 1) * (array.length + 2) / 2;
        for (int number : array) {
            total -= number;
        }
        return total;
    }

}
