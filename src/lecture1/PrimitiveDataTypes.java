package lecture1;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // Primitive data types

        int value = 10;            // integer 整数 (32-bit)
        long longValue = 1000000000; // long 长整数 (64-bit)
        System.out.println(value);
        System.out.println(longValue);

        float smallValue = 2.3f;   // float 浮点数 (32-bit)
        double real = 42.0;        // double 浮点数/小数 (64-bit)
        System.out.println(smallValue);
        System.out.println(real);

        double difference = 2.0 - 1.9;
        System.out.println(difference);
        System.out.println(difference == 0.1);

        char someCharacter = 'x';  // char 单字符 'x'
        System.out.println(someCharacter);

        boolean flag = true;       // boolean 布尔值 true/false
        boolean falseFlag = false;
        System.out.println(flag);
        System.out.println(falseFlag);

    }

}
