package interview.cracking.algorithm;

public class Factorial {

    public static void main(String[] args) {
        int result = factorial(3);

        System.out.println(result);
    }

    private static int factorial(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }

        if (number == 1) {
            return 1;
        }

        return factorial(number - 1) * number;
    }

}
