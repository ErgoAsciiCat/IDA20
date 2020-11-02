import java.util.*;

public class CompGuessNumber {

    public static boolean
    inRange(int range, int min, int max) {
        return (range <= max) || (range >= min);
    }

    public static void GuessGame(int min, int max) {
        //Generera nytt hemligt v�rde
        NumberGenerator secret = new NumberGenerator(min, max);
        secret.drawNbr();


        Random rand = new Random();

        int guess = rand.nextInt(max - min) + min;

        int nbrOfGuess = 1;
        //S� l�nge gissningen �r fel s� ska programmet returnera ifall talet �r st�rre eller mindre �n gissningen. Antal gissningar r�knas upp.
        while (!(secret.isEqual(guess))) {
            int range = max - min;

            if (secret.isBiggerThan(guess)) {
                min = guess;
                guess += (range) / 2;
            } else {
                max = guess;
                guess -= (range / 2);
            }

            if (!inRange(range, min, max))
                System.out.println(range + "");
            nbrOfGuess++;
        }

        System.out.println("Talet var " + guess + " och datorn beh�vde " + nbrOfGuess + " gissningar f�r att hitta talet.");
    }


    public static void main(String[] args) {

        int min = 0;
        int max = Integer.MAX_VALUE / 2;

        System.out.println("Detta �r ett spel d�r datorn ska gissa ett tal mellan " + min + " och " + max + ".");
        for (int i = 0; i <= 3; i++) {
            GuessGame(min, max);
        }

    }
}
