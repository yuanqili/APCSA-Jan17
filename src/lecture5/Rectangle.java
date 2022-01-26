package lecture5;

public class Rectangle {

    double length;
    double width;

    public Rectangle(double length, double width) {
        System.out.println("Rectangle(double, double) started");
        this.length = length;
        this.width = width;
        System.out.println("Rectangle(double, double) finished");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return (width + length) * 2;
    }
}
