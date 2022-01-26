package Algorithms;

public class Fibonacci {

    int calls;
    int[] results;

    Fibonacci() {
        this.calls = 0;
        this.results = new int[100000];
        this.results[1] = 1;
        this.results[2] = 1;
    }

    public int get(int n) {
        System.out.format("[%d] fibonacci(%d)\n", calls++, n);

        // base case
        if (results[n] != 0) {
            return results[n];
        }

        // recursive relation
        int result = get(n - 1) + get(n - 2);
        results[n] = result;
        return result;
    }

    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();

        int n = 4000;
        System.out.format("fib(%d) = %d\n", n, fib.get(n));
    }

}
