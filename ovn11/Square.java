/*import se.lth.cs.window.SimpleWindow;

public class Square extends Shape {
    private int side;

    public Square(int x, int y, int side) {
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
        for (int k = 1; k <= 4; k++) {
            t.forward(side);
            t.left(90);
        }
        t.turnNorth();
        t.penUp();

        int newX = x-side/2;
        int newY = y-side/2;
        w.moveTo(newX,newY);
        newX = x-side/2;
        newY = y+side/2;
        w.lineTo(newX,newY);
        w.moveTo(newX,newY);
        newX = x+side/2;
        newY = y+side/2;
        w.lineTo(newX,newY);
        w.moveTo(newX,newY);
        newX = x+side/2;
        newY = y-side/2;
        w.lineTo(newX,newY);
        w.moveTo(newX,newY);
        newX = x-side/2;
        newY = y-side/2;
        w.lineTo(newX,newY);

    }
}
*/

import se.lth.cs.window.SimpleWindow;

public class Square extends Shape {
    protected int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public void draw(SimpleWindow w) {
        w.moveTo(x, y);
        w.lineTo(x + side, y);
        w.lineTo(x + side, y + side);
        w.lineTo(x, y + side);
        w.lineTo(x, y);
    }
}