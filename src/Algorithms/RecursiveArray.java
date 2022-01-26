package Algorithms;

import java.util.Arrays;

public class RecursiveArray {

    public static int searchIterative(int[] numbers, int item) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static int search(String string, char item) {
        return search(string, item, 0);
    }

    public static int search(String string, char item, int index) {
        System.out.format("search(%s, %c, %d)\n", string, item, index);
        // base cases
        if (string.length() == 0) {
            return -1;
        }
        if (string.charAt(0) == item) {
            return index;
        }
        // recursive relation
        return search(string.substring(1), item, index + 1);
    }

    public static int search(String[] words, String word, int index) {
        System.out.format("search(%s, %s, %d)\n", Arrays.toString(words), word, index);
        if (words.length == 0) {
            return -1;
        }
        if (words[0].equals(word)) {
            return index;
        }

        String[] subwords = new String[words.length - 1];
        for (int i = 0; i < subwords.length; i++) {
            subwords[i] = words[i + 1];
        }

        return search(subwords, word, index + 1);
    }

    public static void main(String[] args) {
        // System.out.format("final result: %d\n", search("helloworld", 'w'));
        String[] words = {"Apple", "Banana", "Cabbage", "Dog", "EEE"};
        search(words, "Cabbage", 0);
    }

}
