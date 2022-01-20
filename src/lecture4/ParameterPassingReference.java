package lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class ParameterPassingReference {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        intAdd5(num);
        System.out.println(num);

        int[] numbers = { 0, 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(numbers));
        arrayAdd5(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void intAdd5(int num) {
        num += 10;
    }

    public static void arrayAdd5(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 10;
        }
    }

    public static void modification(String message, Scanner scanner) {
    }

}
