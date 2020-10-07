package moodle;

public class RailwayCoach {
	private int nbrSeats;
	private int freeSeats;

	public RailwayCoach(int nbrSeats) {
		this.nbrSeats = nbrSeats;
		freeSeats = nbrSeats;
	}

	public int getNbrSeats() {
		return nbrSeats;
	}

	public int getNbrFreeSeats() {
		return freeSeats;
	}

	void makeReservation(int n) {
		freeSeats -= n;
	}
}