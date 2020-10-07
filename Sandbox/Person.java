public class Person {
	public String name;
	public String nbr;

	public void setNumber(String nbr) {
		this.nbr = nbr;
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String nbr) {
		this.name = name;
		this.nbr = nbr;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return nbr;
	}

	public String getPhoneNbr() {
		return nbr;
	}

	public String toString() {
		return (name + " " + nbr);
	}


	class Teacher extends Person {
		private String department;

		public Teacher(String name, String department) {
			super(name);
			this.department = department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String toString() {
			return name + ", " + department;
		}
	}

	class Student extends Person {
		private String program;

		public Student(String name, String program) {
			super(name);
			this.program = program;
		}

		public void setProgram(String program) {
			this.program = program;
		}

		public String toString() {
			return name + ", " + program;
		}
	}
}