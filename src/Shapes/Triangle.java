package Shapes;

public class Triangle extends Shape {

    double length;

    public Triangle(double length) {
        this.length = length;
    }

    public String toString() {
        return "Triangle{" +
                "length=" + length +
                '}';
    }

    double area() {
        return Math.pow(length, 2) * Math.sqrt(3) / 4;
    }

    double perimeter() {
        return length * 3;
    }

}
