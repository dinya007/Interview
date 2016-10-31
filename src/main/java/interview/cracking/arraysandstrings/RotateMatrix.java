package interview.cracking.arraysandstrings;

import java.util.Arrays;

public class RotateMatrix {

    private static final int SIZE = 4;
    private static int[][] matrix = new int[SIZE][SIZE];

    public static void main(String[] args) {


        //firstMatrixForTest
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 2;
        matrix[0][3] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[1][3] = 7;

        matrix[2][0] = 8;
        matrix[2][1] = 9;
        matrix[2][2] = 10;
        matrix[2][3] = 11;

        matrix[3][0] = 12;
        matrix[3][1] = 13;
        matrix[3][2] = 14;
        matrix[3][3] = 15;

        //secondMatrixForTest
//        matrix[0][0] = 0;
//        matrix[0][1] = 1;
//        matrix[0][2] = 2;
//
//        matrix[1][0] = 3;
//        matrix[1][1] = 4;
//        matrix[1][2] = 5;
//
//        matrix[2][0] = 6;
//        matrix[2][1] = 7;
//        matrix[2][2] = 8;

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(rotateMatrix(matrix)));
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int leftTopCorner = 0;
        int rightBottomCorner = SIZE - 1;

        while (leftTopCorner < rightBottomCorner) {
            int minIndex = leftTopCorner + 1;

            if ((SIZE / 2 + 1) == minIndex) return matrix;

            swap(leftTopCorner, leftTopCorner, leftTopCorner, rightBottomCorner);
            swap(leftTopCorner, leftTopCorner, rightBottomCorner, rightBottomCorner);
            swap(leftTopCorner, leftTopCorner, rightBottomCorner, leftTopCorner);

            for (int j = minIndex; j < rightBottomCorner; j++) {
                swap(leftTopCorner, j, leftTopCorner + j, rightBottomCorner);
                swap(j, leftTopCorner, rightBottomCorner, leftTopCorner + j);
            }
            for (int j = minIndex; j < rightBottomCorner; j++) {
                swap(leftTopCorner, j, rightBottomCorner, SIZE - 1 - j);
            }

            ++leftTopCorner;
            --rightBottomCorner;
        }


        return matrix;
    }

    private static void swap(int i1, int j1, int i2, int j2) {
        matrix[i2][j2] = matrix[i1][j1] + matrix[i2][j2];
        matrix[i1][j1] = matrix[i2][j2] - matrix[i1][j1];
        matrix[i2][j2] = matrix[i2][j2] - matrix[i1][j1];
    }

}
