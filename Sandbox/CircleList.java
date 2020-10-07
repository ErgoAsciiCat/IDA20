import java.util.ArrayList;

public class CircleList {
	private ArrayList<Shape.Circle> circles;

	/** Constructs an empty list for circles. */
	public CircleList() {
		this.circles = new ArrayList<Shape.Circle>();

	}

	/**
	 * Adds the circle c to the list if it not ovelaps with any circle in the list.
	 * Return true if circle has been added.
	 */
	public boolean add(Shape.Circle c) {
		if (!overlaps(c)) {
			circles.add(c);
			return true;
		}
		return false;
	}

	/**
	 * Returns true if the circle c ovelaps with any one circle in this list.
	 */
	public boolean overlaps(Shape.Circle c) {
		for (Shape.Circle cComp : circles)
			if (circlesOverlaps(c, cComp)) {
				return true;
			}
		return false;
	}

	private boolean circlesOverlaps(Shape.Circle c1, Shape.Circle c2) {
		return Math.sqrt(Math.pow(c2.getX() - c1.getX(), 2) + Math.pow(c2.getY() - c1.getY(), 2)) < (c1.radius()
				+ c2.radius());
	}

	/**
	 * Adds a circle with the radius r and the center in x, y.
	 */
	public void add(double x, double y, double r) {
		Shape.Circle c = new Shape.Circle(x, y, r);
		circles.add(c);
	}

	/**
	 * Calculates the total area of the circles in the list.
	 */
	public double totalArea() {
		double area = 0;
		for (Shape.Circle c : circles) {
			area += c.area();
		}
		return area;
	}

	public Shape.Circle getBiggest() {
		if (circles.isEmpty()) {
			return null;
		}
		Shape.Circle b = new Shape.Circle(0, 0, 0);
		for (Shape.Circle c : circles) {
			if (b.area() < c.area())
				b = c;
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircleList list = new CircleList();
		list.add(new Shape.Circle(400, 400, 50));
		list.add(new Shape.Circle(200, 200, 100));
		list.add(new Shape.Circle(200, 400, 40));
		double area = (50 * 50 + 100 * 100 + 40 * 40) * Math.PI;
		System.out.println(Math.abs(area - list.totalArea()) < 0.0001);
	}

}
