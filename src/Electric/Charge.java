package Electric;

import java.io.IOException;

public class Charge {

    // instance variables
    private final double rx, ry;
    private final double q;

    // constructors
    public Charge(double rx, double ry, double q) {
        this.rx = rx;
        this.ry = ry;
        this.q = q;
    }

    // methods
    public double potentialAt(double x, double y) {
        double k = 8.99e09;
        double dx = x - rx;
        double dy = y - ry;
        return k * q / Math.sqrt(dx * dx + dy * dy);
    }

    public static Color toColor(double V) {
        V = 128 + V / 2.0e10;
        int t = 0;
        if (V > 255)
            t = 255;
        else if (V >= 0)
            t = (int) V;
        return new Color(t, t, t);
    }

    public String toString() {
        return String.format("Particle Charge %f at (%f, %f)", q, rx, ry);
    }

    public static void main(String[] args) throws IOException {
        // initialization list
        Charge[] charges = new Charge[9];
        charges[0] = new Charge(.20, .63, 30);
        charges[1] = new Charge(.50, .50, 20);
        charges[2] = new Charge(.50, .72, 18);
        charges[3] = new Charge(.90, .84, 54);
        charges[4] = new Charge(.20, .20, -9);
        charges[5] = new Charge(.70, .70, 6);
        charges[6] = new Charge(.37, .67, 27);
        charges[7] = new Charge(.85, .23, 18);
        charges[8] = new Charge(.20, .88, -38);

        final int size = 1280;
        Picture image = new Picture(size, size);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                double V = 0.0;
                double x = 1.0 * col / size;
                double y = 1.0 * row / size;
                for (Charge charge : charges) {
                    V += charge.potentialAt(x, y);
                }
                image.set(col, size - 1 - row, toColor(V));
            }
        }

        image.save("/Users/yuanqili/Desktop/charge1.ppm");
    }
}
