import java.util.*;

public class Dieroll {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] result = new int[13];
        for (int k = 1; k <= 1000; k++) {
            result[(rand.nextInt(6) + 1) + (rand.nextInt(6) + 1)]++;
        }

        int index = 0;
        for (int i : result) {
            System.out.println("Låda nr " + (index++) + " har värde " + i);
        }
    }
}
