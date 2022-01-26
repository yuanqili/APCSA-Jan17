package Primitives;

public class Range {

    public static void main(String[] args) {

        int maxInteger = Integer.MAX_VALUE;
        int minInteger = Integer.MIN_VALUE;

        System.out.println(maxInteger + 1);
        System.out.println(minInteger - 1);

        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;

        System.out.println(positiveInfinity + 100.0);
        System.out.println(negativeInfinity + 100.0);

        // integer/floating-point (numbers): +, -, *, /, %, ++, --, +=, -=, *=, /=
        int value = 100;
        value++;
        value = value + 100;
        value += 100;
        value -= 100;
        value *= 10;
        value /= 10;

        // boolean: and &&, or ||, not !
        // and: a and b, true if both a and b are ture
        // or: a or b, true if any of a and b is true
        // not: !a, invert a
        boolean b1 = true, b2 = false;
    }

}
