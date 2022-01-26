package MathAndWrapper;

import java.util.Arrays;

public class MathUsage {

    public static void main(String[] args) {

        System.out.format("Math.sqrt(23.45) = %f\n", Math.sqrt(23.45));
        System.out.format("Math.abs(23.45) = %f\n", Math.abs(23.45));
        System.out.format("Math.abs(-23.45) = %f\n", Math.abs(-23.45));

        // Math.random() returns a random number in [0.0, 1.0)
        // generates random integer number between [0, 255]
        // generates random integer number between [100, 255]
        int[] randoms = new int[100];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 156) + 100;
        }
        System.out.println(Arrays.toString(randoms));

    }

}
