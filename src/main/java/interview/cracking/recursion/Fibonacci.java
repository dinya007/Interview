package interview.cracking.recursion;

public class Fibonacci {

    public static int fibonacci(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }

        return fibonacci(a - 2) + fibonacci(a - 1);
    }

}
