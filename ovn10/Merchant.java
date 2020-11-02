import java.util.Random;

public class Merchant {
    public static void main(String[] args) {
        MerchGrid merch = new MerchGrid(7);
        Random rand = new Random();
        int dir = rand.nextInt(4);
        merch.X = rand.nextInt(5) + 1;
        merch.Y = rand.nextInt(5) + 1;
        while (merch.freeSpace(merch.X, merch.Y)) {
            merch.chooseFree(dir);
        }

        merch.printGrid(merch.grid);
    }


}

