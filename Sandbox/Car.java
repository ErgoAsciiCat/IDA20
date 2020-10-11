public class Car {
	private final String nbr;
	private Person owner;

	/** Constructs a car with the licenseNbr nbr which is 
	    owned by the person owner. */
	public Car(String licenseNbr, Person owner) {
		// Lägg till egen kod här.
		this.nbr = licenseNbr;
		this.owner = owner;
	}

	/** Returns the licensenbr. */
	public String getLicenseNbr() {
		// Lägg till egen kod här.
		return nbr;
	}

	/** Returns the owner. */
	public Person getOwner() {
		// Lägg till egen kod här.
		return owner;
	}

	/** Changes the car's owner to newOwner. */
	public void changeOwner(Person newOwner) {
		// Lägg till egen kod här.
		this.owner = newOwner;
	}
}
