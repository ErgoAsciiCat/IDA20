import se.lth.cs.window.SimpleWindow;

public class TurtleTriangel {
    public static void Triangel(Turtle t) {
        t.penDown();
        t.right(90);
        t.forward(100);
        t.right(120);
        t.forward(100);
        t.right(120);
        t.forward(100);
        t.turnNorth();
        t.penUp();
    }

    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(500, 500, "Ruta");
        Turtle t = new Turtle(w, 100, 100);

        Triangel(t);
        t.jumpTo(200, 100);
        Triangel(t);
        t.jumpTo(150, 188);
        Triangel(t);


    }

}
