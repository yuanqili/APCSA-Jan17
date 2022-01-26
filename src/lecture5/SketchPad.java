package lecture5;

public class SketchPad {

//    public static void main(String[] args) {
//
//        Rectangle.background();
//
//        Rectangle rect1 = new Rectangle(10.0, 20.0);
//        System.out.println(rect1);
//
//        Rectangle rect2 = new Rectangle(20.0, 40.0);
//        System.out.println(rect2);
//
//        Rectangle rect3 = new Rectangle(30.0);
//        System.out.println(rect3);
//
//        Rectangle rect4 = new Rectangle();
//        System.out.println(rect4);
//
//        System.out.format("There are in total %d rectangles\n", Rectangle.numRectangles);
//    }

    public static void main(String[] args) {

        TencentRectangle rect = new TencentRectangle(10.0, 20.0);
        rect.describe();

        rect.setLength(20.0);
        rect.setWidth(30.0);

        System.out.format("width: %f\n", rect.getWidth());
        System.out.format("length: %f\n", rect.getLength());
        System.out.format("area: %f\n", rect.area());
        System.out.format("peri: %f\n", rect.perimeter());

    }
}
