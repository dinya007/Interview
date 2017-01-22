package interview.cracking.bitmanipulation;

public class BitNumberDifferenceBetweenTwoIntegers {

    public static void main(String[] args) {
        int a = 31;
        System.out.println(Integer.toBinaryString(a));
        int b = 14;
        System.out.println(Integer.toBinaryString(b));

        System.out.println("Difference: " + determineDifference(a, b));


    }

    private static int determineDifference(int a, int b) {
        int result = 0;
        for (int c = a ^ b; c != 0; c = c >> 1) {
            result += c & 1;
        }
        return result;
    }

}
