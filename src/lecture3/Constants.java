package lecture3;

import java.util.Scanner;

public class Constants {

    public static void main(String[] args) {

        final int a = 10;

        // compile time error
        // a = 11;

        // run time error
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

    }

}
