package interview.cracking.recursion;

public class Factorial {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        return n * factorial(n - 1);
    }

}
