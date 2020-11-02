import se.lth.cs.window.SimpleWindow;

public abstract class Shape {
    protected int x, y;

    protected Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }


    /**
     * Returns the x coordinate of the center.
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the y coordinate of the center.
     */
    public double getY() {
        return y;
    }

    /**
     * Ritar upp figuren i fönstret w
     */
    public abstract void draw(SimpleWindow w);

    /**
     * Raderar bilden av figuren, flyttar figuren till newX,newY
     * och ritar upp den på sin nya plats i fönstret w
     */
    public void moveToAndDraw(SimpleWindow w, int newX, int newY) {
        java.awt.Color savedColor = java.awt.Color.BLACK;
        w.setLineColor(java.awt.Color.WHITE);
        draw(w);
        x = newX;
        y = newY;
        w.setLineColor(savedColor);
        draw(w);
    }

    /**
     * Undersöker om punkten xc,yc ligger "nära" figuren
     */
    public boolean near(int xc, int yc) {
        return Math.abs(x - xc) < 80 && Math.abs(y - yc) < 50;
    }

} 
	
	