package lecture2;

import java.sql.SQLSyntaxErrorException;

public class Loops {

    public static void main(String[] args) {

        // int i = 0: initialization
        // i < 10: entry condition
        // i++: update
        System.out.println("The For Loop");
        for (int i = 0; i < 10; i++) {
            System.out.println("the value of i is " + i);
        }

        System.out.println("The While Loop");
        int j = 0;
        while (j < 10) {
            System.out.println("the value of i is " + j);
            j++;
        }

        for (byte i = 0; i >= 0; i++) {
            System.out.println(i);
        }

        while (true) {
            System.out.println("Hello World");
        }

    }

}
