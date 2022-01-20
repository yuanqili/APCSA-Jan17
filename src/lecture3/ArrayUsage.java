package lecture3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUsage {

    // int main(int argc, char **argv)
    public static void main(String[] args) {

        // type[] variable_name = new type[length];
        // Scanner scanner = new Scanner(System.in);
        // String message = new String("hello");
        int[] integers = new int[10];         // default: 0
        double[] doubles = new double[10];    // default: 0
        boolean[] booleans = new boolean[10]; // default: false

        // ArrayIndexOutOfBoundsException
        // for (int i = 0; i < 100; i++) {
        //     System.out.println(integers[i]);
        // }

        int[] scores = {82, 49, 65, 100, 94, 32, 54, 23, 67};
        System.out.println(Arrays.toString(scores));

        for (int i = 0; i < scores.length; i += 2) {
            System.out.print(scores[i] + " ");
            if (i + 1 < scores.length)
                System.out.println(scores[i + 1]);
        }

        // Enhanced for loop
        // For primitive data types,
        // use enhanced-for loop only for visiting their values,
        // but not for modification
        for (int score: scores) {
            score += 10;
        }
        System.out.println(Arrays.toString(scores));

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.format("Sum of scores is: %d\n", sum);

        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.format("Max of scores is: %d\n", max);

        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        System.out.format("Min of scores is: %d\n", min);

        double mean = (double) sum / scores.length;
        System.out.format("Mean of scores is: %f\n", mean);

        // int[] scores = {82, 49, 65, 100, 94, 32, 54, 23, 67};
        // variance = [(80 - mean)^2 + (49 - mean)^2 + ... + (67 - mean)^2] / (length - 1)
        double variance = 0;
        for (int score: scores) {
            variance += Math.pow((score - mean), 2);
        }
        variance /= scores.length;
        System.out.format("Variance of scores is: %f\n", variance);

        double stDev = Math.sqrt(variance);
        System.out.format("StDev of scores is: %f\n", stDev);

        boolean existsUnderSixty = false;
        for (int score: scores) {
            if (score < 60) {
                existsUnderSixty = true;
                break;
            }
        }
        System.out.format("Is there any <60? %b\n", existsUnderSixty);

        int numUnderSixty = 0;
        for (int score: scores) {
            if (score < 60) {
                numUnderSixty += 1;
            }
        }
        System.out.format("Num of <60: %d\n", numUnderSixty);

    }

    boolean hasUnderSixty(int[] scores) {
        for (int score: scores) {
            if (score < 60) {
                return true;
            }
        }
        return false;
    }

    boolean allUnderSixty(int[] scores) {
        for (int score: scores) {
            if (score >= 60) {
                return false;
            }
        }
        return true;
    }

}
