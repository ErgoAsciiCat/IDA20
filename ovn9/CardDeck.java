import java.util.*;

public class CardDeck {
    private final Card[] cards;
    private int deckIndex;

    public CardDeck() {
        int i = 0;
        this.cards = new Card[52];
        for (Card.Suits s : Card.Suits.values()) {
            for (Card.Ranks r : Card.Ranks.values()) {
                cards[i++] = (new Card(s, r));
            }
        }
        deckIndex = cards.length - 1;
    }

    public void shuffle() {
        Random rand = new Random();
        //Collections.shuffle(cards);
        for (int i = deckIndex; i > 0; i--) {
            Card swap = cards[i];
            int shuffleIndex = rand.nextInt(i);
            cards[i] = cards[shuffleIndex];
            cards[shuffleIndex] = swap;

        }
    }

    public boolean moreCards() {
        return (deckIndex > 0);

    }

    public Card getCard() {
        Card c = cards[deckIndex];
        System.out.println(c);
        cards[deckIndex--] = null;
        return c;
    }
}
