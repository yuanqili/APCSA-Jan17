package Algorithms;

public class RecursiveExplosion {

    public static void recursion(int i) {
        System.out.format("recursion(%d)\n", i);
        int[] numbers = new int[100];
        recursion(i + 1);
    }

    public static void main(String[] args) {
        recursion(1);
    }

}
