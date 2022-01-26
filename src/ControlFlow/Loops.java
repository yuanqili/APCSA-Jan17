package ControlFlow;

public class Loops {

    public static void main(String[] args) {

        int[] numbers = { 11, 22, 33, 44, 55 };

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();

//        int j = 0;
//        while (j < numbers.length) {
//            System.out.print(numbers[i] + " ");
//            j++;
//        }
//        System.out.println();

        // break: jump out of the loop
        // continue: skip the rest of the code, continue to the next iteration
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] == 33) {
                continue;
            }
        }

        int i = 0;
        while (true) {
            System.out.println("Enters loop " + i);
            if (i == 10) {
                break;
            }
            i++;
            System.out.println("Finishes loop " + i);
        }

    }

}
