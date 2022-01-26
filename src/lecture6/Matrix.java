package lecture6;

import java.util.Arrays;

public class Matrix {

    final int rows;
    final int cols;
    int[][] matrix;

    public Matrix(int rows, int cols, int[][] matrix) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = matrix;
    }

    public Matrix add(Matrix other) {
        int[][] result = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = this.matrix[row][col] + other.matrix[row][col];
            }
        }
        return new Matrix(rows, cols, result);
    }

    public Matrix subtract(Matrix other) {
        int[][] result = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = this.matrix[row][col] - other.matrix[row][col];
            }
        }
        return new Matrix(rows, cols, result);
    }

    public Matrix multiply(Matrix other) {
        int[][] result = new int[rows][other.cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < other.cols; col++) {
                for (int i = 0; i < cols; i++) {
                    result[row][col] = this.matrix[row][i] * other.matrix[i][col];
                }
            }
        }
        return new Matrix(rows, cols, result);
    }

    public Matrix multiply(int c) {
        int[][] result = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = this.matrix[row][col] * c;
            }
        }
        return new Matrix(rows, cols, result);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int[] row : matrix) {
            result.append(Arrays.toString(row)).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[][] mat1Matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix mat1 = new Matrix(3, 3, mat1Matrix);
        System.out.println(mat1);

        int[][] mat2Matrix = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        Matrix mat2 = new Matrix(3, 3, mat2Matrix);
        System.out.println(mat2);

        Matrix sum = mat1.add(mat2);
        System.out.println(sum);

        Matrix diff = mat1.subtract(mat2);
        System.out.println(diff);

        Matrix product = mat1.multiply(mat2);
        System.out.println(product);

        Matrix scalarProduct = mat1.multiply(5);
        System.out.println(scalarProduct);
    }

}
