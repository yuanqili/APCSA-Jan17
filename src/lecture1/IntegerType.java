package lecture1;

public class IntegerType {

    public static void main(String[] args) {

        // Java Coding Convention

        int superLarge = 2147483647;
        System.out.println(superLarge);

        int superSuperLarge = 2147483647 + 1;
        System.out.println(superSuperLarge);

        int supersuperSmall = -2147483648 - 1;
        System.out.println(supersuperSmall);

        // if a and b are both numbers:
        // +=, -=, *=, /=, %=
        // [a += b] a = a + b
        // [a -= b] a = a - b
        // [a *= b] a = a * b
        // [a /= b] a = a / b
        // [a %= b] a = a % b
        // ++ increment, -- decrement
        // [a++] a = a + 1, a += 1
        // [a--] a = a - 1, a -= 1

        int value = 20;
        for (int i = 0; i < 10; i++) {
            value += i;
            System.out.format("iteration %d: value = %d\n", i, value);
        }
    }

}
