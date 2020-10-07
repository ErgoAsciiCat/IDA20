package moodle;

import java.util.*;

public class nbrDigit {

/*	public static int[] nbrDigits(int start, int stop, int interval) {
		// Fyll i egen kod
		int[] totDigits = new int[10];
		for (int i = start; i <= stop; i += interval) {
			int[]temp = Integer.toString(i).chars().map(c -> c-'0').toArray();  

			for (int talpos = temp.length-1; talpos >= 0; talpos--) {
				for (int k = 0; k < totDigits.length; k++) {
					 if (temp[talpos] == k) {
						totDigits[k]++;
					}
				}
			}

		}
		return totDigits;
	}*/
	
	public static int[] nbrDigits(int start, int stop, int interval) {
	    // Fyll i egen kod
		int[] totDigits = new int[10];
		
		for (int i = start; i <= stop; i += interval) {
			int nbr = i;
			while (nbr >= 1) {
				totDigits[(nbr%10)]++;
				nbr /= 10;
			}
			
			
				
		}
		
		return totDigits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int strt = 101;
		int stp = 125;
		int intrvl = 2;
		int[] k = new int[10];

		k = nbrDigits(strt, stp, intrvl);
		System.out.print(Arrays.toString(k));
	}

}

/*
 * for(
 * 
 * int k = 0;k<totDigits.length;k++){ if () if (i%k == 0) totDigits[k]++; }
 */