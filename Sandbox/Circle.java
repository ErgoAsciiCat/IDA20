import se.lth.cs.window.SimpleWindow;

class Circle extends Shape {
    private int radius;
    private int x;
    private int y;

    /**
     * Constructs a circle with the radie radius and the center in x, y.
     */
    public Circle(int x, int y, int r) {
        super(x, y);
        this.radius = r;
    }

    /**
     * Returns the radius.
     */
    public int radius() {
        return radius;
    }

    /**
     * Returns the area.
     */
    public double area() {
        return Math.PI * radius * radius;
    }

    public void print() {
        System.out.println("Cirkel: " + x + " " + y + " " + radius);
    }

    public void draw(SimpleWindow w) {
        Turtle t = new Turtle(w,x,y);
        t.penDown();
        t.turnNorth();
        t.jumpTo(x,y);
        t.forward(radius);
        for (int k = 0; k <= 3600; k++) {
            t.forward((int) (Math.round(radius/1*Math.toRadians(0.36))));
            t.left(360/3600);
        }
        t.turnNorth();
        t.penUp();

    }
}