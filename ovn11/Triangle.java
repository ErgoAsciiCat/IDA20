/*import se.lth.cs.window.SimpleWindow;

class Triangle extends Shape {
    private final int side;

    public Triangle(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public void print() {
        System.out.println("Kvadrat: " + x + " " + y + " " + side);
    }

    public void draw(SimpleWindow w) {

        Turtle t = new Turtle(w,x,y);
        t.penDown();
        t.turnNorth();
        t.jumpTo(x,y);
        for (int k = 1; k <= 3; k++) {
            t.forward(side);
            t.left(60);
        }
        t.turnNorth();
        t.penUp();


        int newX = x;
        int newY = y;
        w.moveTo(newX,newY);
        newX = x+side;
        newY = y;
        w.lineTo(newX,newY);
        w.moveTo(newX,newY);
        newX = x+side/2;
        newY = (int) (Math.round(Math.sin(60)*side)+y);
        w.lineTo(newX,newY);
        w.moveTo(newX,newY);
        newX = x;
        newY = y;
    }
}*/


import se.lth.cs.window.SimpleWindow;

public class Triangle extends Shape {
    protected int side;

    public Triangle(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public void draw(SimpleWindow w) {
        w.moveTo(x, y);
        w.lineTo(x + (int) Math.round(Math.cos(Math.PI / 3) * side), y - (int) Math.round(Math.sin(Math.PI / 3) * side));
        w.lineTo(x + side, y);
        w.lineTo(x, y);
    }
}