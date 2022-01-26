package SketckPad;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    String message() {
        return "Huge Cirrrrrrrrrcle";
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle [%f] area: %f, peri: %f", radius, area(), perimeter());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle);
    }
}
