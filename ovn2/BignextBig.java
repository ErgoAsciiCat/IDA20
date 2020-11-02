import java.util.Scanner;

public class BignextBig {
    public static void main(String[] args) {
        int talet, sumS, big = 0, nextBig = 0;
        Scanner scan = new Scanner(System.in);

        for (int k = 1; k <= 10; k++) {
            talet = scan.nextInt();
            if (talet > big) {
                nextBig = big;
                big = talet;
            } else if (talet > nextBig) {
                nextBig = talet;
            }
        }
        sumS = big - nextBig;
        System.out.println("De tv� st�rsta talen i talserien �r " + big + " och " + nextBig);
        System.out.print("Skillnaden mellan dessa �r " + sumS);

    }
}
