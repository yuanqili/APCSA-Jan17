package Drawing;

import java.util.ArrayList;

public class ArrayListUsage {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);  // auto-boxing
        numbers.add(42);
        numbers.add(86);
        numbers.add(100);
        numbers.add(200);
        numbers.add(3, 1000);

        System.out.print("ArrayList<Integer> numbers: [");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.format("%d, ", numbers.get(i));
        }
        System.out.println("]");

        int replaced = numbers.set(3, 4000);  // auto-unboxing
        System.out.format("The item being replaced was: %d\n", replaced);
        System.out.print("ArrayList<Integer> numbers: [");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.format("%d, ", numbers.get(i));
        }
        System.out.println("]");

        int removed = numbers.remove(3);
        System.out.format("The item being removed was: %d\n", removed);
        System.out.print("ArrayList<Integer> numbers: [");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.format("%d, ", numbers.get(i));
        }
        System.out.println("]");
    }

}
