package lecture2;

public class TypeCasting {

    public static void main(String[] args) {

        // boolean: 1 bit
        // byte: 8-bit integer
        // short: 16-bit integer
        // int: 32-bit integer
        // long: 64-bit integer
        // float: 32-bit floating point
        // double: 64-bit floating point

        // Automatic/Implicit type conversion (Coercion)
        System.out.println( 1 / (double) 2 + 0.5 );

        // Explicit type conversion (Casting)
        System.out.println( (int) (1 / 2 + 0.5) );

        System.out.format("(int) 0.0 = %d\n", (int) 0.0);
        System.out.format("(int) 0.4 = %d\n", (int) 0.4);
        System.out.format("(int) 0.5 = %d\n", (int) 0.5);
        System.out.format("(int) 0.8 = %d\n", (int) 0.8);
        System.out.format("(int) 10.0 = %d\n", (int) 10.0);
        System.out.format("(int) 10.4 = %d\n", (int) 10.4);
        System.out.format("(int) 10.5 = %d\n", (int) 10.5);
        System.out.format("(int) 10.8 = %d\n", (int) 10.8);

        System.out.format("(int) -0.0 = %d\n", (int) -0.0);
        System.out.format("(int) -0.4 = %d\n", (int) -0.4);
        System.out.format("(int) -0.5 = %d\n", (int) -0.5);
        System.out.format("(int) -0.8 = %d\n", (int) -0.8);
        System.out.format("(int) -10.0 = %d\n", (int) -10.0);
        System.out.format("(int) -10.4 = %d\n", (int) -10.4);
        System.out.format("(int) -10.5 = %d\n", (int) -10.5);
        System.out.format("(int) -10.8 = %d\n", (int) -10.8);

        System.out.println("10 / 3 = " + 10 / 3);
        System.out.println("10 + 3 = " + (10 + 3));

        short shortValue = Short.parseShort("42");
        int intValue = Integer.parseInt("42");
        long longValue = Long.parseLong("42");
        float floatValue = Float.parseFloat("42.0");
        double doubleValue = Double.parseDouble("42.0");
    }

}
