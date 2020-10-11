import java.util.*;

public class chapter3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		boolean included;

        included = 200 >= n && 100 <= n;
        System.out.println(included);
	}

}
