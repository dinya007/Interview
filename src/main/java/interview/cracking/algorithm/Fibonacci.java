package interview.cracking.algorithm;

public class Fibonacci {

    public static void main(String[] args) {
        int result = fibonacci(5);

        System.out.println(result);
    }

    private static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}
