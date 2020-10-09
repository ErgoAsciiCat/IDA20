import java.util.*;
public class VectorShenanigansChars {
	public static void main(String[] args) {
		Random rand = new Random();
		TrainingVector alphabet = new TrainingVector(0);
		int chr = 65;
		for (int i = 0; i < 26; i++) {
			alphabet.v = alphabet.add(chr, i);
			chr++;
		}	
		while (alphabet.checkForPositives()) {
			if (alphabet.length() == 0) {
				continue;
			}else {
			//System.out.println(alphabet.length());
			alphabet.v = alphabet.remove(rand.nextInt(alphabet.length()));
			for (int i : alphabet.v) {
				System.out.print((char) i);
			}
			System.out.println();
			}
		}
	}
}

