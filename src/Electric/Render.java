package Electric;

import java.io.IOException;

public class Render {

    public static void main(String[] args) throws IOException {

        int imageWidth = 512;
        int imageHeight = 512;
        Picture picture = new Picture(imageWidth, imageHeight);

        for (int j = imageHeight - 1; j >= 0; --j) {
            for (int i = 0; i < imageWidth; ++i) {
                double r = (double) (i) / (imageWidth - 1);
                double g = (double) (j) / (imageHeight - 1);
                double b = 0.25;
                Color c = new Color((int) (256 * r), (int) (256 * g), (int) (256 * b));
                picture.set(i, j, c);
            }
        }

        picture.save("/Users/yuanqili/Desktop/colors.ppm");

    }
}
