package moodle;

import java.util.*;

public class chapter3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		boolean included = false;

		if (200 >= n && 100 <= n){
		    included = true;
		}else {
		    included = false;
		};
		System.out.println(included);
	}

}
