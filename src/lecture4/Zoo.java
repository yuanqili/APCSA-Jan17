package lecture4;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Black", "Black", "Jacky", 3, true);
        dog1.describe();
        dog1.cute("cat");
        Dog.bark();

        Dog dog2 = new Dog("Tommy", 2, false);
        dog2.describe();
        dog2.cute("tiger");
        dog2.bark();

        Dog dog3 = new Dog();
        dog3.describe();
        dog3.cute("my PC");
        dog3.bark();
    }

}
