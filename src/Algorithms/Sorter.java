package Algorithms;

import java.util.ArrayList;

public class Sorter {

    private ArrayList<Integer> numbers;

    public Sorter() {
        this.numbers = new ArrayList<>();
    }

    public Sorter(int[] numbers) {
        this.numbers = new ArrayList<>();
        for (int number : numbers) {
            this.numbers.add(number);
        }
    }

    public void add(Integer element) {
        this.numbers.add(element);
    }

    public void swap(int i, int j) {
        int temp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);
    }

    // 冒泡排序
    public void bubbleSort() {
        for (int i = numbers.size(); i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    swap(j, j + 1);
                }
            }
        }
    }

    // 插入排序
    public void insertionSort() {
        for (int i = 1; i < numbers.size(); i++) {
            int selected = numbers.get(i);
            int j = i - 1;
            for (; j >= 0 && numbers.get(j) > selected; j--) {
                numbers.set(j + 1, numbers.get(j));
            }
            numbers.set(j + 1, selected);
        }
    }

    // 选择排序
    public void selectionSort() {
        for (int i = 0; i < numbers.size() - 1; i++) {
            int minIndex = i;
            int min = numbers.get(i);
            for (int j = i; j < numbers.size(); j++) {
                if (numbers.get(j) < min) {
                    min = numbers.get(j);
                    minIndex = j;
                }
            }
            swap(minIndex, i);
        }
    }

    /**
     * Executes the binary search algorithm on numbers.
     *
     * @param value the item to be searched.
     * @return -1 if the element to be searched does not exist,
     * index of the element if it exists.
     */
    public int binarySearch(int value) {
        int left = 0;
        int right = numbers.size() - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers.get(middle) == value) {
                return middle;
            }
            if (numbers.get(middle) < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public void print() {
        System.out.println(this.numbers.toString());
    }

    public static void main(String[] args) {

        int[] numbers = {9, 4, 7, 3, 2, 10, 8};

        Sorter sorter = new Sorter(numbers);
        sorter.print();

        sorter.selectionSort();
        sorter.print();

        System.out.format("%d's index is %d\n", 10, sorter.binarySearch(10));
        System.out.format("%d's index is %d\n", 18, sorter.binarySearch(18));
        System.out.format("%d's index is %d\n", 9, sorter.binarySearch(9));
        System.out.format("%d's index is %d\n", 4, sorter.binarySearch(4));

    }
}
