package Primitives;

import java.util.Scanner;

public class UserInteraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a message: ");
        String message = scanner.nextLine();
        System.out.println("You just input " + message + ".");

        System.out.print("Please input a integer number: ");
        int integerInput = scanner.nextInt();
        System.out.println("You just input " + integerInput + ".");

        System.out.print("Please input a integer number: ");
        integerInput = scanner.nextInt();
        System.out.println("You just input " + integerInput + ".");

        System.out.print("Please input a integer number: ");
        integerInput = scanner.nextInt();
        System.out.println("You just input " + integerInput + ".");

        System.out.print("Please input a floating-point number: ");
        double floatingPointInput = scanner.nextDouble();
        System.out.println("You just input " + floatingPointInput + ".");
    }

}
