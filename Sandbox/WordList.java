import java.util.ArrayList;

public class WordList {
	private final ArrayList<String> list;

	/** Construct a empty list. */
	public WordList() {
		this.list = new ArrayList<>();
	}

	/** Appends the specified word to the end of this list. */
	public void add(String word) {
		list.add(word);
	}

	public ArrayList<String> startsWith(String s) {
		ArrayList<String> tempList = new ArrayList<>();
		for (String chk : list) {
			if (chk.startsWith(s))
				tempList.add(chk);
		}

		return tempList;
	}

	/**
	 * Lägger till ordet word sist i listan ifall det inte redan finns. Returnerar
	 * true om ordet har lagts in, annars false.
	 */
// OBS! Metoden innehåller ett fel
	public boolean addWithCheck(String word) {
		for (String s : list) {
			if (s.equals(word)) {
				return false;
			}
		}
		list.add(word);
		return true;
	}

	public static void main(String[] args) {

		WordList words = new WordList();
		words.add("apelsin");
		words.add("banan");
		words.add("citron");
		words.add("aprikos");
		System.out.println(words.startsWith("ap"));
	}

}