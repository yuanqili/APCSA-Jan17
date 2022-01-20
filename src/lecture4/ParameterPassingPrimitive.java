package lecture4;

public class ParameterPassingPrimitive {

    public static void main(String[] args) {
        int a = 10;
        System.out.format("[main] a: %d\n", a);
        method1(a);
    }

    // scope of a name
    // parameter passing
    static void method1(int a) {
        a += 10;
        System.out.format("[method1] a: %d\n", a);
        method2(a);
    }

    static void method2(int a) {
        a += 20;
        System.out.format("[method2] a: %d\n", a);
        method3(a);
    }

    static void method3(int a) {
        a += 30;
        System.out.format("[method3] a: %d\n", a);
    }

}
