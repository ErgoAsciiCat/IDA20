import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //Deklaration
        Scanner scan = new Scanner(System.in);
        int max;
        int min;
        int nbrOfGuess = 1;
        int guess;


        System.out.println("Ange min och max separerat med ett mellanslag.");
        min = scan.nextInt();
        max = scan.nextInt();

        //Generera nytt hemligt v�rde
        NumberGenerator secret = new NumberGenerator(min, max);
        secret.drawNbr();

        System.out.println("Detta �r ett spel d�r du ska gissa ett tal mellan " + min + " och " + max + ".");
        System.out.println("Skriv in din f�rsta gissning:");

        guess = scan.nextInt();

        //S� l�nge gissningen �r fel s� ska programmet returnera ifall talet �r st�rre eller mindre �n gissningen. Antal gissningar r�knas upp.
        while (!secret.isEqual(guess)) {
            if (secret.isBiggerThan(guess)) {
                System.out.println("Talet �r st�rre �n " + guess);
            } else {
                System.out.println("Talet �r mindre �n " + guess);
            }

            System.out.println("Skriv in din n�sta gissning:");
            guess = scan.nextInt();

            nbrOfGuess++;
            System.out.println("Du har gissat " + nbrOfGuess + " g�nger.");
        }
        scan.close();
        System.out.print("Talet var " + guess + " och du beh�vde " + nbrOfGuess + " gissningar f�r att hitta talet.");

    }
}
