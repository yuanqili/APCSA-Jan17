package lecture2;

public class LoopControl {

    public static void main(String[] args) {

        // break: leaves the nearest loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("The value of i is " + i);
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j > i) {
                    continue;
                }
                System.out.format("%2d*%2d=%2d ", i, j, i * j);
            }
            System.out.println();
        }

        int j = 0;
        while (j < 10) {
            if (j == 5) {
                break;
            }
            System.out.println("the value of i is " + j);
            j++;
        }

        // continue: leaves the current loop, enters the next loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("The value of i is " + i);
        }

//        while (true) {
//            if (/* condition */) {
//                break;
//            }
//        }
    }

}
