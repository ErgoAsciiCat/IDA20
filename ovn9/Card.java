public class Card {
	public Suits suit;
	public Ranks rank;

	public enum Suits {
		SPADES,
		HEARTS,
		DIAMONDS,
		CLUBS,
		//COINS,
		//CUPS,
		//FLOWERS
	}

	public enum Ranks {
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		//COUNT,
		QUEEN,
		KING,
		//EMPEROR,
		//EMPRESS
	}
	
	/** Skapar ett spelkort med f?rgen suit (SPADES, HEARTS, DIAMONDS, CLUBS) 
	    och val?ren rank (1-13) */

		public Card(Suits suit, Ranks rank) {
			this.suit = suit;
			this.rank = rank;
		}

	/** Tar reda p? f?rgen */
	public int getSuit() {
		return switch (suit){
			case SPADES -> 1;
			case HEARTS -> 2;
			case DIAMONDS -> 3;
			case CLUBS -> 4;
			//case COINS -> 5;
			//case CUPS -> 6;
			//case FLOWERS -> 7;
		};
	}

	/** Tar reda p? val?ren */
	public int getRank() {
		return switch (rank){
			case ACE -> 1;
			case TWO -> 2;
			case THREE -> 3;
			case FOUR -> 4;
			case FIVE -> 5;
			case SIX -> 6;
			case SEVEN -> 7;
			case EIGHT -> 8;
			case NINE -> 9;
			case TEN -> 10;
			case JACK -> 11;
			//case COUNT -> 12;
			case QUEEN -> 12;
			case KING -> 13;
			//case EMPEROR -> 15;
			//case EMPRESS -> 16;
		};
	}

	/** Returnerar en l?sbar representation av kortet, t ex "spader ess" */
	public String toString(){
		String suitString = switch (suit) {
			case SPADES -> "of Spades";
			case HEARTS -> "of Hearts";
			case DIAMONDS -> "of Diamonds";
			case CLUBS -> "of Clubs";
			//case COINS -> "of Coins";
			//case CUPS -> "of Cups";
			//case FLOWERS -> "of Flowers";
		};
		String rankString = switch (rank) {
			case ACE -> "Ace";
			case TWO -> "Two";
			case THREE -> "Three";
			case FOUR -> "Four";
			case FIVE -> "Five";
			case SIX -> "Six";
			case SEVEN -> "Seven";
			case EIGHT -> "Eight";
			case NINE -> "Nine";
			case TEN -> "Ten";
			case JACK -> "Jack";
			//case COUNT -> "Count";
			case QUEEN -> "Queen";
			case KING -> "King";
			//case EMPEROR -> "Emperor";
			//case EMPRESS -> "Empress";
		};
		return rankString + " " + suitString;
	}
}