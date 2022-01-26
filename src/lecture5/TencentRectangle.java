package lecture5;

public class TencentRectangle {

    // instance variable
    // length & width belong to a certain object
    private double length;
    private double width;

    /** Records the number of times accessing length or width. */
    private int numAccesses;

    // static variable
    // numRectangles is a property of the Rectangle class
    static int numRectangles = 0;

    // If you do not define any constructors,
    // Java will automatically generate a no-arg constructor,
    // with all variables set to default value
    //
    // Rectangle() {
    //     this.length = 0;
    //     this.width = 0;
    // }

    TencentRectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numRectangles++;
        numAccesses = 0;
    }

    public double getLength() {
        numAccesses++;
        if (numAccesses > 10) {
            System.out.println("请充值后再访问矩形长度");
            return -1;
        } else {
            return length;
        }
    }

    public double getWidth() {
        numAccesses++;
        if (numAccesses > 10) {
            System.out.println("请充值后再访问矩形宽度");
            return -1;
        } else {
            return width;
        }
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length + width) * 2;
    }

    public void describe() {
        System.out.format("Rectangle (%.4f, %.4f)\n", this.length, this.width);
        System.out.format("     Area: %.4f\n", this.area());
        System.out.format("Perimeter: %.4f\n", this.perimeter());
    }

    public String toString() {
        return String.format("Rectangle (%.4f, %.4f)", this.length, this.width);
    }

    // static method
    // this method can be called without any actual instance of Rectangle
    // 1. no access to instance variable
    // 2. no access to non-static methods
    public static void background() {
        System.out.println("In Euclidean plane geometry, a rectangle is a quadrilateral with four right angles. It can also be defined as: an equiangular quadrilateral, since equiangular means that all of its angles are equal (360°/4 = 90°)");
    }
}
