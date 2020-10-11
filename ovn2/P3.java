import java.util.Scanner;
import java.util.Arrays;
public class P3 {

	public static void P35() {
		int antal = 0;
		int nbr1, nbr2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mata in heltal, avsluta med 0: ");
		nbr1 = scan.nextInt();
		nbr2 = nbr1;
		do{
			nbr1 = scan.nextInt();
			if (nbr2 == nbr1) {
			antal++;
			}
			nbr2 = nbr1;
		} while  (nbr1 > 0);
		
		System.out.print("Antal gånger påträffats i talföljden: " + antal);
	}
	
	public static void P34() {
		double medel=0,strd=0;
		Scanner scan = new Scanner(System.in);
		double[] tal;
		
		System.out.println("Mata in antalet tal i talföljden");
		tal = new double[scan.nextInt()];
		
		for (int i = 0; i < tal.length; i++ ) { //Läs in talföljden
			tal[i]=scan.nextDouble();
            medel = medel + tal[i];
            if (tal.length > 5) { //Om antalet tal i följden är st�rre än 5 så följ standdardavvikelsens metod
            	strd += Math.pow(tal[i],2);
            }
		}
		
		medel = medel / tal.length;//Beräkna medel
		System.out.println(Arrays.toString(tal));
		
		if (tal.length > 5) {
			strd= Math.sqrt((strd-(Math.pow(medel, 2)* tal.length))/(tal.length -1));
			System.out.println("Standardavvikelsen är : "+ strd);
		}else {
			System.out.println("För få tal i talföljden för standardavvikelse.");
		}
		System.out.println("Medelvärdet är: " + medel);
	}
	
	public static void P33() {
		int ant=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mata in heltal, avsluta med 0: ");
		while  (scan.nextInt() > 0){
			ant++;
		} 
		System.out.print("Antal tal i talföljden: " + ant);
		

		}
		
	public static void P32() {
		int sum = 0, ant = 0;
	while (sum < 100000){
		ant++;
		sum=sum+(ant*2-1);
	}

	System.out.println(sum+" "+ant);
	}

	public static void P31() {
		int tal = 0;
		  for (int k=1; k<=99 ;k++) {
			tal = tal + k;
			System.out.println(tal+" "+k);
			}
	}
	
	public static void main(String[] args) {
		
		//P35();
		//P34();
		P33();
		//P32();
		//P31();
	}
}
		
		