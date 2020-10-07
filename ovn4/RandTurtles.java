import se.lth.cs.p.ovn.turtle.Turtle;
import se.lth.cs.window.SimpleWindow;

import java.util.Random;

public class RandTurtles {

	public static void Turtlestep(Turtle t) {
		Random rand = new Random();
		int nbr1, nbr2;
		nbr1 = 1 + rand.nextInt(10);
		nbr2 = -179 + rand.nextInt(359);
		t.penDown();
		t.forward(nbr1);
		t.penUp();
		t.right(nbr2);
	}

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Square");
		Turtle t1 = new Turtle(w, 250, 250);
		Turtle t2 = new Turtle(w, 350, 350);
		
		while (Math.sqrt((Math.pow((t2.getX() - t1.getX()), 2)) + (Math.pow((t2.getY() - t1.getY()), 2))) >= 50) {
			Turtlestep(t1);
			Turtlestep(t2);
			SimpleWindow.delay(10);
		}

	}
}