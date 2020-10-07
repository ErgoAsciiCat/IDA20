
import java.util.Scanner;
public class Primkoll {

	public static void main(String[] args) {
		int primkoll=0;
		boolean prim = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mata in ett udda heltal: ");
		primkoll = scan.nextInt();
		if (primkoll % 2 == 0) {
			System.out.print("Talet är ej udda.");
		}
			
		for (int k = 3; k <= Math.sqrt(primkoll); k=k+2 ) {
			if (primkoll%k == 0) {
				prim = false;
				primkoll = k;
				break;
			}
				prim = true;
			}
		
		if (prim == true) {
			System.out.print("Talet är primtal!");
		}else
			System.out.print("Talet är ej ett primtal, det är delbart med " + primkoll + ".");
		
		
	}

}
