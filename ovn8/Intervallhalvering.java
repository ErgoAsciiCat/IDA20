
public class Intervallhalvering {
	public static void main(String[] args) {
		double low = 0.0;
		double high = 1.6;
		double divisor = 2;
		
		while (high-low > Math.pow(10, -5) ) {
			
		double x = (high+low)/divisor;
		double func = Math.pow(Math.E, -x)-1+Math.cos(x);
		System.out.println(x);
		
		if (func >= 0) {
			high = x;
		}else{
			low = x;
		}
		
		
		
		}
		
		System.out.println(high);
	}
}
