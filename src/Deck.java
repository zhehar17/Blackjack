import java.util.ArrayList;
public class Deck {
    private static ArrayList<Card> deck;
    private static final Card[] fullDeck = new Card[52];
    private static final String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
    private static final String[] types = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    
    public Deck() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < types.length; j++) {
                deck.add(new Card(suits[i], types[j]));        
            }
        }
        for (int i = 0; i < fullDeck.length; i++) {
            fullDeck[i] = deck.get(i);
        }
    }
}
