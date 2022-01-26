package Algorithms;

import java.util.Arrays;

public class MergeSort {

    static int[] aux;

    public static void merge(int[] array, int low, int mid, int high) {
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            aux[k] = array[k];
        }
        for (int k = low; k <= high; k++) {
            if (i > mid)
                array[k] = aux[j++];
            else if (j > high)
                array[k] = aux[i++];
            else if (aux[j] < aux[i])
                array[k] = aux[j++];
            else
                array[k] = aux[i++];
        }
    }

    public static void sort(int[] array) {
        aux = new int[array.length];
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int low, int high) {
        if (high <= low)
            return;
        int mid = low + (high - low) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 8, 7, 6, 4, 9, 3, 5};
        System.out.println(Arrays.toString(numbers));

        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
