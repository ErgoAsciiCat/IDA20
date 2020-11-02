
import se.lth.cs.p.inl1.*;
import se.lth.cs.p.inl1.nbr14.*;

public class Display {
    public static void main(String[] args) {
        TextWindow window = new TextWindow("Hemlisar");
        TextView viewCrypto = new TextView("CryptoText", 4, 200);
        TextView viewMySolution = new TextView("My Solution", 4, 200);
        TextView viewCorrect = new TextView("Correct Solution", 4, 200);
        Key key = new Key();
        TestCase testCase = new TestCase();
        Decryptographer decrypt = new Decryptographer(key);

        window.addView(viewCrypto);
        window.addView(viewMySolution);
        window.addView(viewCorrect);

        for (int nbr = 1; nbr <= 5; nbr++) {
            viewCrypto.displayText(testCase.getCryptoText(nbr));
            viewCorrect.displayText(testCase.getClearText(nbr));
            viewMySolution.displayText(decrypt.decrypt(testCase.getCryptoText(nbr)));
            window.waitForMouseClick();
        }

    }
}
