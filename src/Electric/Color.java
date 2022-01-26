package Electric;

public class Color {

    int red;
    int green;
    int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String toString() {
        return String.format("%d %d %d", red, green, blue);
    }
}
