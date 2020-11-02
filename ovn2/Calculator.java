
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double nbr1, nbr2, sumA, sumS, sumM, sumD;
        double digit1, digit2, digit3;
        System.out.println("Skriv tv� tal ");
        Scanner scan = new Scanner(System.in);
        nbr1 = scan.nextDouble();
        nbr2 = scan.nextDouble();
        sumA = nbr1 + nbr2;
        sumS = nbr1 - nbr2;
        sumM = nbr1 * nbr2;
        sumD = nbr1 / nbr2;
        System.out.println("Summan av talen �r " + sumA);
        System.out.println("Skillnaden mellan talen �r " + sumS);
        System.out.println("Produkten av talen �r " + sumM);
        System.out.println("Kvoten av talen �r " + sumD);
        digit1 = (int) nbr1 % 10;
        digit2 = ((int) nbr1 / 10) % 10;
        digit3 = ((int) nbr1 / 100) % 10;
        System.out.println(digit3 + " " + digit2 + " " + digit1);

    }


}
