import java.util.ArrayList;
public class Hand {
    private int numCards;
    private ArrayList<Card> cards;
    private static String[] possibleTypes = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    private static int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,0}
    public Hand() {
        numCards = 0; 
        cards = new ArrayList<Card>();
    }

    public void drawCard() {
        cards.add(Deck.drawCard());
    }

    public int getValue() {
        int value = 0;
        for (int i = 0; i < cards.size(); i++) {
            
        }
    }
}
