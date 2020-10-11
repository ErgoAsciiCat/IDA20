import java.util.*;

public class CardDeck {
    private final List<Card> cards;

    public CardDeck(){
        this.cards = new ArrayList<>();
        for (Card.Suits s : Card.Suits.values()) {
            for (Card.Ranks r : Card.Ranks.values()) {
                cards.add(new Card(s,r));
            }
        }

    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public boolean moreCards(){
        return !cards.isEmpty();
    }

    public Card getCard(){
        Card c = cards.get(cards.size()-1);
        cards.remove(cards.size()-1);
        return c;
    }
}
