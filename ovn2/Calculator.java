
import java.util.Scanner;
public class Calculator {

	private static Scanner scan;

	public static void main(String[] args) {
		double nbr1=0,nbr2=0,sumA=0,sumS=0,sumM=0,sumD=0;
		double	digit1=0,digit2=0,digit3=0;
		System.out.println("Skriv två tal ");
		scan = new Scanner(System.in);
		nbr1=scan.nextDouble();
		nbr2=scan.nextDouble();
		sumA = nbr1+nbr2;
		sumS = nbr1-nbr2;
		sumM = nbr1*nbr2;
		sumD = nbr1/nbr2;
		System.out.println("Summan av talen är "+sumA);
		System.out.println("Skillnaden mellan talen är "+sumS);
		System.out.println("Produkten av talen är "+sumM);
		System.out.println("Kvoten av talen är "+sumD);
		digit1 = (int)nbr1 % 10;
		digit2 = ((int)nbr1/10)%10;
		digit3 = ((int)nbr1/100)%10;
		System.out.println(digit3 + " "+digit2 + " "+digit1);
		
	}
	

}
