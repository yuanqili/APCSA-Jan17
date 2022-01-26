package Shapes;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    double area() {
        return width * length;
    }

    double perimeter() {
        return (width + length) * 2;
    }

    void rectangleHahaha() {
        System.out.format("中华民族万岁！");
    }

}
