package SketckPad;

public class Rectangle extends Shape {

    // instance variables
    // encapsulation
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        // super() invokes Shape's constructor: Shape()
        super();
        this.length = length;
        this.width = width;
    }

    String message() {
        return "Huge Rectttttttttangleeeeeee";
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return (length + width) * 2;
    }

    public String toString() {
        return String.format("Rectangle [%f, %f] area: %f, peri: %f", length, width, area(), perimeter());
    }

    public boolean equals(Rectangle other) {
        return this.length == other.length && this.width == other.width;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10.0, 20.0);
        System.out.println(rect1);

        Rectangle rect2 = new Rectangle(10.0, 20.0);
        System.out.println(rect2);

        Rectangle rect3 = rect1;

        if (rect1 == rect2) {
            System.out.println("rect1 is equal to rect2 [object reference level]");
        } else {
            System.out.println("rect1 is NOT equal to rect2 [object reference level]");
        }

        if (rect1.equals(rect2)) {
            System.out.println("rect1 is equal to rect2 [object content level]");
        } else {
            System.out.println("rect1 is NOT equal to rect2 [object content level]");
        }

        if (rect1 == rect3) {
            System.out.println("rect1 is equal to rect3 [object reference level]");
        } else {
            System.out.println("rect1 is NOT equal to rect3 [object reference level]");
        }
    }
}
