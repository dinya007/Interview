package interview.cracking.arraysandstrings;

import java.util.Arrays;

public class ReplaceMatrixColumnRowWith0 {

    private static final int N = 4;
    private static final int M = 3;

    public static void main(String[] args) {
        int[][] matrix = new int[N][M];

        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 2;

        matrix[1][0] = 3;
        matrix[1][1] = 4;
        matrix[1][2] = 5;

        matrix[2][0] = 6;
        matrix[2][1] = 0;
        matrix[2][2] = 8;

        matrix[3][0] = 9;
        matrix[3][1] = 10;
        matrix[3][2] = 11;

        long zeroColumns = 0;
        long zeroRows = 0;

        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows |= (1 << i);
                    zeroColumns |= (1 << j);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if ((zeroRows & (1 << i)) > 0 && (zeroColumns & (1 << j)) > 0){
                    for (int k = 0; k < M; k++) {
                        matrix[i][k] = 0;
                    }
                    for (int k = 0; k < N; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

}
