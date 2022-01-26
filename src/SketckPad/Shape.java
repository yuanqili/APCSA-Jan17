package SketckPad;

import lecture6.Matrix;

// superclass
public class Shape {

    // no instance variables

    // constructor takes no arguments, does nothing
    // if you do not implement such a method
    // Java will also generate one for you
    // Shape() {
    // }

    double area() {
        return -1;
    }

    double perimeter() {
        return -1;
    }

    public String toString() {
        return String.format("Generic Shape");
    }

    public static void main(String[] args) {

        // Rectangle "IS-A" Shape
        // Circle "IS-A" Shape
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(10.0, 20.0);
        shapes[1] = new Circle(10.0);
        shapes[2] = new Rectangle(8.0, 24.0);
        shapes[3] = new Circle(8.0);

        // polymorphism 多态
        for (Shape shape: shapes) {
            System.out.println(shape.area());
        }

    }

}
