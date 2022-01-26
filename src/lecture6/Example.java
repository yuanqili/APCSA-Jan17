package lecture6;

import java.util.Arrays;

public class Example {

    int[] scores;

    Example(int[] scores) {
        this.scores = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            this.scores[i] = scores[i];
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        Example exp = new Example(values);

        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(exp.scores));

        values[0] = 100;
        values[1] = 200;

        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(exp.scores));
    }

}
