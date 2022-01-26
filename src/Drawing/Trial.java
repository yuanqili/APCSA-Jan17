package Drawing;

import processing.core.PApplet;
import processing.core.PVector;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Trial extends PApplet {

    private final int width = 800;
    private final int height = 800;

    // ArrayList<>: Generic class/type, 泛型
    // ArrayList<T> variableName = new ArrayList<>();
    ArrayList<PVector> trail = new ArrayList<>();
    int listLimit = 100;

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        noStroke();
    }

    public void draw() {
        background(50);

        // Add a point to the end of the trail at the mouse position
        trail.add(new PVector(mouseX, mouseY));

        // If the trail gets too long, remove the first (oldest) point
        if (trail.size() > listLimit) {
            trail.remove(0);
        }

        // Draw the trail
        for (int i = 0; i < trail.size(); i++) {
            PVector p = trail.get(i);
            // The trail is smaller at the beginning,
            // and larger closer to the mouse
            float size = (float) (50.0 * i / trail.size());
            ellipse(p.x, p.y, size, size);
        }
    }

    public static void main(String[] args) {
        PApplet.main(MethodHandles.lookup().lookupClass().getName());
    }

}
