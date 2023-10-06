public class Card {
    // each card has a suit of type Suit and rank of type Rank 
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //  constructor for copy of a card
    public Card(Card card) {
        this.suit = card.getSuit();
        this.rank = card.getRank();
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
        return ("[" + suit.suitSymbol + " " + rank + " of " + suit + " " + suit.suitSymbol + "] (" + this.getValue() + ")");
    }
}