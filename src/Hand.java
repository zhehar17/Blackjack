import java.util.ArrayList;
public class Hand {
    private int numCards;
    private ArrayList<Card> cards;
    private static final String[] possibleTypes = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    private static final int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
    private int numAces;
    private int handValue;

    public Hand() {
        numCards = 0; 
        cards = new ArrayList<Card>();
        numAces = 0;
    }

    public void drawCard() {
        cards.add(Deck.drawCard());
        numCards++;
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getType().equals("Ace")) {
                numAces ++;
            }
        }
    }

    public boolean bust() {
        return handValue > 21;
    }

    public void calculateValue() {
        int value = 0;
        int index = 0;
        for (Card card : cards) {
            for (int i = 0; i < possibleTypes.length; i++) {
                if (card.getType().equals(possibleTypes[i])) {
                    index = i;
                }
            }
            value += values[index];
        }
        handValue = value;
        while (bust() && numAces != 0) {
            handValue -= 10;
            numAces--;
        }
    }

    public int getValue() {
        return handValue;
    }

}
