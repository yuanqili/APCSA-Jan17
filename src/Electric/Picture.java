package Electric;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Picture {

    private final int width;
    private final int length;
    public Color[][] image;

    public Picture(int width, int length) {
        this.width = width;
        this.length = length;
        this.image = new Color[width][length];
    }

    /**
     * Sets the pixel at (x, y) to color.
     */
    public void set(int x, int y, Color color) {
        image[x][y] = color;
    }

    public void print() {
        System.out.println("P3");
        System.out.format("%d %d\n", width, length);
        System.out.println("255");
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < width; col++) {
                System.out.println(this.image[row][col]);
            }
        }
    }

    /**
     * Saves the Color[][] image array to filename.
     */
    public void save(String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        fos.write("P3\n".getBytes(StandardCharsets.UTF_8));
        fos.write(String.format("%d %d\n", width, length).getBytes(StandardCharsets.UTF_8));
        fos.write("255\n".getBytes(StandardCharsets.UTF_8));
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < width; col++) {
                fos.write(String.format("%s\n", this.image[row][col]).getBytes(StandardCharsets.UTF_8));
            }
        }
    }
}
