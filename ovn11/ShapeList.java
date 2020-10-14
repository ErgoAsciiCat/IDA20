
import se.lth.cs.window.SimpleWindow;

import java.util.ArrayList;

public class ShapeList {
    private ArrayList<Shape> shapes;

    public ShapeList() {
        shapes = new ArrayList<Shape>();
    }

    // Lägger in en figur i listan.
    public void insert(Shape s) {
        shapes.add(s);
    }

    // Figuren som ska läggas in i listan.
    public void draw(SimpleWindow w) {
        for (Shape s : shapes) {
            s.draw(w);
        }
    }

    // Ritar upp figurerna som finns i listan i fönstret.
    public Shape findHit(int xc, int yc) {
        for (Shape s : shapes) {
            if (s.near(xc, yc))
                return s;
        }
        return null;
        // Tar reda på en figur som ligger nära punkten xc,yc.
        // Om flera figurer ligger nära så returneras den första som hittas.
        // Om ingen figur ligger nära returneras null.
    }
}