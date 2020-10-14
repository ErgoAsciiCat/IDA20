public abstract class ShapeOld {
	protected int x;
	protected int y;
	protected double x2;
	protected double y2;

	protected ShapeOld(int x, int y) {
		this.x = x;
		this.y = y;
	}

	protected ShapeOld(double x2, double y2) {
		this.x2 = x2;
		this.y2 = y2;
	}
	// övriga metoder

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


	static class Circle extends ShapeOld {
		private final double radius;
		private double x;
		private double y;

		/**
		 * Constructs a circle with the radie radius and the center in x, y.
		 */
		public Circle(double x2, double y2, double r) {
			super(x2, y2);
			this.radius = r;
		}

		/**
		 * Returns the radius.
		 */
		public double radius() {
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
	}

	class Square extends ShapeOld {
		private final int side;

		public Square(int x, int y, int side) {
			super(x, y);
			this.side = side;
		}

		public void print() {
			System.out.println("Kvadrat: " + x + " " + y + " " + side);
		}
	}
}