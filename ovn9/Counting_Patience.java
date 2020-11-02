public class Counting_Patience {
    public static void main(String[] args) {
        int successes = 0;
        int amount = 100000;
        for (int i = 0; i < amount; i++) {
            if (countingGame()) {
                successes++;
            }
        }
        double chance = (double) successes / (double) amount;
        System.out.println("Counting game was played 100.000 times and out of those the game was won " + successes + "times.");
        System.out.println("This gives a chance of winning of " + chance);
    }

    private static boolean countingGame() {
        CardDeck deck = new CardDeck();
        deck.shuffle();
        int count = 1;
        //int[] patienceVector = new int[3];
        while (deck.moreCards()) {
            Card c = deck.getCard();
            if (count == c.getRank()) {
                return false;
            }
            if (count == 3) {
                count = 1;
            } else {
                count++;
            }
        }
        return true;
    }
}
