package lecture2;

import java.util.Scanner;

public class HailstoneSequence {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input the starting number: ");
//        int value = scanner.nextInt();

        for (int starting = 1; starting <= 100; starting++) {

            int value = starting;
            System.out.format("[%d] ", starting);
            while (value != 1) {
                System.out.format("%d ", value);
                if (value % 2 == 0) {
                    value = value / 2;
                } else {
                    value = value * 3 + 1;
                }
            }
            System.out.println(value);

        }
    }

}
