import java.util.*;

public class ReverseNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Fyll i egen kod
		double[] a = new double[10];
		for (int i = 0; i <= 9; i++) {
			a[i] = scan.nextDouble();
		}
		for (int i = 9; i >= 0; i--) {
			System.out.print(a[i]);
		}
		scan.close();
	}
}
