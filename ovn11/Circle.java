import se.lth.cs.window.SimpleWindow;

public class Circle extends Shape {
    private int radius;

    /**
     * Skapar en cirkel från superklassen Shape
     * x och y koordinaterna anger det mittpunkten i cirkeln
     */
    protected Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw(SimpleWindow w) {
        w.moveTo(x + radius, y);
        for (int i = 1; i <= 90; i++) {
            double angle = i * 2 * Math.PI / 90;
            w.lineTo((int) Math.round(x + radius * Math.cos(angle)), (int) Math.round(y + radius * Math.sin(angle)));
        }
    }
}
