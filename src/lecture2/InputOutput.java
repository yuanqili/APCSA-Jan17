package lecture2;

import java.util.Locale;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        // Output
        // System.out: standard output to a terminal

        // Input
        // System.in: standard input from a terminal

        // Reference data types, Class/Object
        Scanner scanner     = new Scanner(System.in);
        String  message     = new String("Hello World");
        String  message2    = "Hello World";  // syntax sugar 语法糖

        // Primitive data types
        char    singleChar  = 'a';
        byte    singleByte  = 10;
        short   shortValue  = 5;
        int     value       = 10;
        double  doubleValue = 42.0;
        boolean trueFalse   = true;

        // Methods of a String object
        System.out.println( message );
        System.out.println( message.toUpperCase() );
        System.out.println( message.toLowerCase() );
        System.out.println( message.substring(3) );

        // Methods of a Scanner object

        // Exception handling
        try {
            System.out.println("Please input an integer: ");
            int readInteger = scanner.nextInt();
            System.out.println("just read integer: " + readInteger);
        } catch (java.util.InputMismatchException exception) {
            System.out.println("you should not input random stuff!");
        }

        System.out.println("Please input a double: ");
        double readDouble = scanner.nextDouble();
        System.out.println("just read double: " + readDouble);

        System.out.println("Please input another integer: ");
        int anotherInteger = scanner.nextInt();
        System.out.println("just read another integer: " + anotherInteger);

        System.out.println("Please input a message: ");
        String inputMessage = scanner.next();
        System.out.println("just read string: " + inputMessage);

    }

}
