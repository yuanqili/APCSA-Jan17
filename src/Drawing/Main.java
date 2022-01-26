package Drawing;

import processing.core.PApplet;

import java.lang.invoke.MethodHandles;

public class Main extends PApplet {

    // nested class
    class Circle {

        float x, y, xSpeed, ySpeed, radius;
        String name;
        float r, g, b;

        public Circle(float x, float y, float xSpeed, float ySpeed, float radius, String name) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
            this.radius = radius;
            this.name = name;

            int[] color = murakamiColor();
            this.r = color[0];
            this.g = color[1];
            this.b = color[2];
        }

        void move() {
            x += xSpeed;
            if (x < 0 || x > width)
                xSpeed *= -1;

            y += ySpeed;
            if (y < 0 || y > height)
                ySpeed *= -1;
        }

        void display() {
            fill(r, g, b);
            ellipse(x, y, radius * 2, radius * 2);
        }
    }

    private final int width = 800;
    private final int height = 800;

    private final int[][] colors = {
            {234, 61, 16},
            {255, 221, 5},
            {2, 168, 234},
            {242, 145, 160},
            {11, 162, 99},
            {255, 255, 255},
    };

    Circle[] circles = new Circle[50];

    int numCollisions = 0;

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(random(width), random(height),
                    random(-5, 5), random(-5, 5),
                    30, String.format("Circle %d", i));
        }
    }

    @Override
    public void draw() {
        background(152, 190, 100);
        for (Circle circle : circles) {
            circle.move();
            circle.display();

            for (Circle other : circles) {
                if (circle == other)
                    continue;
                double xDiff = other.x - circle.x;
                double yDiff = other.y - circle.y;
                double distance = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
                if (distance < circle.radius + other.radius) {
                    System.out.format("Circle collision [%d], %s & %s\n", numCollisions++, circle.name, other.name);
                    circle.x -= 10 * circle.xSpeed;
                    circle.y -= 10 * circle.ySpeed;
                    circle.xSpeed *= -1;
                    circle.ySpeed *= -1;
                    other.x -= 10 * other.xSpeed;
                    other.y -= 10 * other.ySpeed;
                    other.xSpeed *= -1;
                    other.ySpeed *= -1;
                }
            }

        }
    }

    public int[] murakamiColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

    public static void main(String[] args) {
        PApplet.main(MethodHandles.lookup().lookupClass().getName());
    }

}
