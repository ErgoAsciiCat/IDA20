import java.util.Random;

public class NumberGenerator {
    private static final Random rand = new Random();  // slumptalsgenerator
    private int secretNbr;						// det hemliga talet
    private int min;							// minsta v�rde det hemliga talet kan ha
    private int max;							// st�rsta v�rde det hamliga talet kan ha

    /** Skapar ett objekt som kan generera med ett slumpm�ssigt valt hemligt
     heltal i intervallet [min, max]. */
    public NumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    /** Drar ett nytt hemligt tal. */
    public void drawNbr() {
        secretNbr = rand.nextInt(max-min)+min;
    }

    /** Tar reda p� minsta m�jliga v�rde det hemliga talet kan ha. */
    public int getMin() {
        return min;
    }

    /** Tar reda p� st�rsta m�jliga v�rde det hemliga talet kan ha. */
    public int getMax() {
        return max;
    }

    /** S�tter min till input. */
    public void setMin(int x) {
        min = x;
    }

    /** S�tter max till input. */
    public void setMax(int x) {
        max = x;
    }

    /** Tar reda p� om det hemliga talet �r lika med guess. */
    public boolean isEqual(int guess) {
        return guess == secretNbr;
    }

    /** Tar reda p� om det hemliga talet �r st�rre �n guess. */
    public boolean isBiggerThan(int guess) {
        return guess < secretNbr;
    }
}

