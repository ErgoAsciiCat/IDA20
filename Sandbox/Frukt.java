public class Frukt {
	private final String country;

	public Frukt(String country) {
		this.country = country;
	}

	public String toString() {
		return "från " + country;
	}
}

class Apelsin extends Frukt {
	private final double w;

	public Apelsin(String country, double weight) {
		super(country);
		this.w = weight;
	}

	public String toString() {
		return "Apelsin " + super.toString() + " med vikten " + w + " g. ";
	}
}

class Banan extends Frukt {
	private final double length;

	public Banan(String country, double length) {
		super(country);
		this.length = length;
	}

	public String toString() {
		return "Banan " + super.toString() + " med längden " + length + " cm ";
	}

	public static void main(String[] args) {
		Frukt f1 = new Banan("Jamaica", 15);
		Apelsin f2 = new Apelsin("Grekland", 50);
		System.out.println(f1);
		System.out.println(f2);
	}
}