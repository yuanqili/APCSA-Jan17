package MiniProjects;

import java.util.Scanner;

public class SinTaylor {

    public static void main(String[] args) {

        // sin x = x^1/1! - x^3/3! + x^5/5! - x^7/7! + x^9/9! + ...
        // 1: + x^1/1!
        // 2: - x^3/3!
        // 3: + x^5/5!
        // 4: - x^7/7!
        // i: (-1)^(i+1) * x^(2*i-1)/(2*i-1)!

        System.out.print("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        final int n = 8;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            long factorial = 1;
            for (int j = 1; j <= (2 * i - 1); j++)
                factorial *= j;
            sum += Math.pow(-1, i + 1) * Math.pow(x, 2 * i - 1) / factorial;
        }
        System.out.format("sin(%f) = %f\nMath.sin(%f) = %f\n", x, sum, x, Math.sin(x));
    }

}
