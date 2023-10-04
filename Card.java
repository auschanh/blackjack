public class Card {
    // each card has a suit of type Suit and rank of type Rank 
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // getter methods to figure out a card's suit and rank
    public int getValue() {
        return rank.rankValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString() {
        return ("[" + rank + " of " + suit + "] (" + this.getValue() + ")");
    }
}