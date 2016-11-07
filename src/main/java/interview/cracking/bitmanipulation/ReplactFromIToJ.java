package interview.cracking.bitmanipulation;

public class ReplactFromIToJ {

    public static void main(String[] args) {
        int N = Integer.parseInt("10000011010", 2);
        int M = Integer.parseInt("10101", 2);
        int i = 2;
        int j = 6;

        System.out.println(Integer.parseInt("11101", 2));

        System.out.println(Integer.toBinaryString(replace(N, M, i, j)));
    }

    private static int replace(int n, int m, int i, int j) {
        int clearMask = ~(((1 << (j - i)) - 1) << i);
        n = n & clearMask;
        return n | (m << i);
    }

}
