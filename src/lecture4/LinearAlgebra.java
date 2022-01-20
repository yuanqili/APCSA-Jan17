package lecture4;

import java.util.Arrays;

public class LinearAlgebra {

    public static void main(String[] args) {

        int[] vec1 = { 1, 2, 3, 4 };
        int[] vec2 = { 5, 6, 7, 8 };
        int value = 5;

        int dotProduct = multiplication(vec1, vec2);
        int[] scalarProduct = multiplication(vec1, value);

        System.out.format("%s * %s = %d\n", Arrays.toString(vec1), Arrays.toString(vec2), dotProduct);
        System.out.format("%s * %d = %s\n", Arrays.toString(vec1), value, Arrays.toString(scalarProduct));
    }

    // lhs: left-hand side
    // rhs: right-hand side
    static int multiplication(int[] lhs, int[] rhs) {
        int result = 0;
        for (int i = 0; i < lhs.length; i++) {
            result += lhs[i] * rhs[i];
        }
        return result;
    }

    static int[] multiplication(int[] lhs, int rhs) {
        int[] result = new int[lhs.length];
        for (int i = 0; i < lhs.length; i++) {
            result[i] = lhs[i] * rhs;
        }
        return result;
    }
}
