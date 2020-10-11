public class City {
	private final String name;
	private int nbr;

	/**
	 * Constructs a city with the name name and the number of inhabitants to nbr.
	 */
	public City(String name, int nbr) {
		this.name = name;
		this.nbr = nbr;
	}

	/** Returns the name. */
	public String getName() {
		return name;
	}

	/** Returns the number of inhabitants. */
	public int getInhabitants() {
		return nbr;
	}

	/** Changes the number of inhabitants to nbr. */
	public void setNbrInhabitans(int nbr) {
		this.nbr = nbr;
	}

	public boolean greaterThan(City otherCity) {
        return nbr > otherCity.getInhabitants();
    }
}