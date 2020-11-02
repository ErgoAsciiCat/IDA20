import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;

public class DrawSquare {

    public static void Square(Turtle t) {
        t.penDown();
        for (int k = 1; k <= 4; k++) {
            t.right(90);
            t.forward(300);
        }
        t.penUp();
    }


    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "Square");
        Turtle t = new Turtle(w, 100, 100);

        while (true) {
            w.waitForMouseClick();
            int x = w.getMouseX();
            int y = w.getMouseY();
            t.jumpTo(x, y);
            Square(t);
        }

    }
}