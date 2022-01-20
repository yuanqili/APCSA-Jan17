package lecture4;

public class Methods {

    public static void main(String[] args) {

        sayHello();
        sayHello("Yuanqi Li");
        System.out.format("Compounded Return: $%.2f\n", calculateReturn(10000, 0.02, 3));
        System.out.format("Wind Chill: %.2f\n", windChill(20, 10));

        method();
        method(10);
        method(1, 2);
        method(1.1, 2.2);
        method(1, 2.2);

    }

    // function, methods, procedure, sub-procedure
    // return_type method_name(parameter_list) { ... }
    // return_type: double
    // method_name: calculateReturn
    // parameter_list: double P, double r, double t
    public static double calculateReturn(double P, double r, double t) {
        // P e^{rt}
        return P * Math.pow(Math.E, r * t);
    }

    public static double windChill(double temperature, double velocity) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16);
    }

    public static void sayHello() {
        System.out.format("Hello, man\n");
    }

    // Method overloading: 重载函数
    // Signature: void sayHello(String)
    public static void sayHello(String name) {
        System.out.format("Hello, %s\n", name);
    }

    // void method(int, int)
    public static void method(int a, int b) {
        System.out.println("(int a, int b)");
    }

    // void method(double, double)
    public static void method(double a, double b) {
        System.out.println("(double a, double b)");
    }

    // void method(int, double)
    public static void method(int a, double b) {
        System.out.println("(int a, double b)");
    }

    // void method(int)
    public static void method(int a) {
        System.out.println("(int a)");
    }

    // void method()
    public static void method() {
        System.out.println("()");
    }

}
