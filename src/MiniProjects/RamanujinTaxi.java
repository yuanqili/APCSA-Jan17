package MiniProjects;

import java.util.Scanner;

public class RamanujinTaxi {

    public static void main(String[] args) {

        System.out.print("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean success = false;
            // a^3 + b^3 = c^3 + d^3
            for (int a = 1; Math.pow(a, 3) <= i; a++) {
                for (int b = 1; Math.pow(b, 3) <= i; b++) {
                    for (int c = 1; Math.pow(c, 3) <= i; c++) {
                        for (int d = 1; Math.pow(d, 3) <= i; d++) {
                            // if a, b, c, d are not distinct, continue
                            if (!(a != b && a != c && a != d && b != c && b != d && c != d)) {
                                continue;
                            }
                            if (Math.pow(a, 3) + Math.pow(b, 3) == i && Math.pow(c, 3) + Math.pow(d, 3) == i) {
                                System.out.format("[%d] %d^3 + %d^3 = %d^3 + %d^3\n", i, a, b, c, d);
                                success = true;
                            }
                            if (success) {
                                break;
                            }
                        }
                        if (success) {
                            break;
                        }
                    }
                    if (success) {
                        break;
                    }
                }
                if (success) {
                    break;
                }
            }

        }

    }

}
