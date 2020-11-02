
import java.util.Scanner;

public class Primkoll {

    public static void main(String[] args) {
        int primkoll;
        boolean prim = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Mata in ett udda heltal: ");
        primkoll = scan.nextInt();
        if (primkoll % 2 == 0) {
            System.out.print("Talet �r ej udda.");
        }

        for (int k = 3; k <= Math.sqrt(primkoll); k = k + 2) {
            if (primkoll % k == 0) {
                prim = false;
                primkoll = k;
                break;
            }
            prim = true;
        }

        if (prim) {
            System.out.print("Talet �r primtal!");
        } else
            System.out.print("Talet �r ej ett primtal, det �r delbart med " + primkoll + ".");


    }

}
