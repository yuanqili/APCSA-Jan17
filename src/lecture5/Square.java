package lecture5;

// Superclass (parent class)
// Subclass (child class)
// Inheritance 继承
// Square inherits Rectangle's all public methods

public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    public static void main(String[] args) {
        Square square = new Square(10.0);
        System.out.format("Square (%f, %f)\n", square.length, square.width);
        System.out.format("Area %f\n", square.area());
        System.out.format("Perimeter %f\n", square.perimeter());
    }

}
