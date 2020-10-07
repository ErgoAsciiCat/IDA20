public class week5n6 {

	public static void main(String[] args) {
		// Fyll i egen kod
		Person p = new Person("Eva Alm");
		Person b = new Person("Bo Ek");

		Car c1 = new Car("ABC123", b);
		Car c2 = new Car("XYZ789", p);

		System.out.println(c1.getLicenseNbr() + " " + c1.getOwner().getName());
		System.out.println(c2.getLicenseNbr() + " " + c2.getOwner().getName());
		System.out.println(p.getName());
	}
}
