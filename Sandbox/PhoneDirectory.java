import java.util.ArrayList;

public class PhoneDirectory {
	private final ArrayList<Person> persons; // personerna i katalogen

	/** Skapar en tom telefonkatalog. */
	public PhoneDirectory() {
		this.persons = new ArrayList<>();
	}

	public void addPerson(String name, String nbr) {
		Person p = new Person(name, nbr);
		persons.add(p);

	}

	/** Sorterar den interna listan stigande med azvseende på namn */
	public void sortPersons() {
		// Skriv din kod här!
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < persons.size() - 1; i++) {
				if ((persons.get(i).getName()).compareTo(persons.get(i + 1).getName()) > 0) {
					Person swap = persons.get(i);
					persons.set(i, persons.get(i + 1));
					persons.set(i + 1, swap);
					sorted = false;
				}
			}
		}
	}

	/** Returnerar en ny lista, sorterad stigande med avseende på namn */
	public ArrayList<Person> getSortedPersonList() {
		// Skriv din kod här
		ArrayList<Person> sortedList = new ArrayList<>(persons);

		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < sortedList.size() - 1; i++) {
				if ((sortedList.get(i).getName()).compareTo(sortedList.get(i + 1).getName()) > 0) {
					Person swap = sortedList.get(i);
					sortedList.set(i, sortedList.get(i + 1));
					sortedList.set(i + 1, swap);
					sorted = false;
				}
			}
		}
		return sortedList;
	}

	/**Returnerar en vektor med personer, sorterad fallande med avseende på nummer*/		
	public Person[] getSortedPersonArray(){
	   Person[] pVektor = new Person[persons.size()];
	   int i = 0;
	   for (Person p : persons){
	       pVektor[i] = new Person(p.getName() , p.getPhoneNbr());
	       i++;
	   }
        
        boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (i = 0; i < pVektor.length - 1; i++) {
				if (pVektor[i].getPhoneNbr().compareTo(pVektor[i+1].getPhoneNbr()) < 0) {
					Person swap = pVektor[i];
					pVektor[i] = pVektor[i+1];
					pVektor[i+1] = swap;
					sorted = false;
				}
			}
		}	
	 return pVektor;   
	}
	/**
	 * Returnerar personlistan som en sträng enligt formatet för ArrayLists
	 * toString()-metod
	 */
	public String toString() {
		// OBS ändra inte denna
		return persons.toString();
	}



	// Ev andra metoder kommer i nästa uppgift

	public static void main(String[] args) {
		
		PhoneDirectory pb = new PhoneDirectory();
		pb.addPerson("Sandra", "123");
		pb.addPerson("Alice", "333");
		pb.addPerson("Peter", "1234");
		pb.addPerson("Anna", "6453");
		//java.util.ArrayList resultat = pb.getSortedPersonList();
		Person [] resultat = pb.getSortedPersonArray();
		System.out.println("Ny lista: ");
		for (Person person : resultat) {
		System.out.println("\t" + person);
		}
		System.out.println("Befintlig telefonbok: " + pb);

	}
}
