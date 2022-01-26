package Shapes;

// super class
public class Shape {

    double area() {
        return -1;
    }

    double perimeter() {
        return -1;
    }

    public String toString() {
        return "Generic Shape";
    }

    void summary() {
        System.out.format("%s, area: %f, perimeter: %f\n", toString(), area(), perimeter());
    }

    public static void main(String[] args) {
        // Overriding methods in subclasses
        Shape shape1 = new Rectangle(10.0, 20.0);
        Shape shape2 = new Triangle(10.0);

        // Polymorphism 多态
        // Dynamic dispatching 动态分发
        // Rectangle "IS-A" is a Shape
        // Triangle "IS-A" is a Shape
        Shape[] shapes = { shape1, shape2 };
        for (Shape shape : shapes) {
            System.out.format("%s, area: %f, perimeter: %f\n",
                    shape.toString(), shape.area(), shape.perimeter());
        }
    }
}
