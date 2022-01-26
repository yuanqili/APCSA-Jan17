package lecture6;

import java.util.ArrayList;

public class TwoDArray {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        boolean[] booleans = new boolean[10];

        int[] initializedNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int value : initializedNumbers) {
            System.out.print(value + " ");
        }

        int rows = 3;
        int cols = 5;
        int[][] matrix = new int[rows][cols];

        // traditional for loop to traverse each value by [row][col]
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // enhanced for loop to traverse a matrix
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int[][] matrix2 = new int[10][];
        for (int row = 0; row < 10; row++) {
            matrix2[row] = new int[row + 1];
        }
        for (int[] row : matrix2) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

}
