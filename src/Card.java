public class Card {
    private String suit;
    private char type;
    
    public Card(String suit, char type) {
        this.suit = suit;
        this.type = type;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
