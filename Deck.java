import java.util.ArrayList;

public class Deck {
    // manages the deck of cards with an arrayList
    private ArrayList<Card> deck;
    // default constructor with no arguments
    public Deck(){
        deck = new ArrayList<Card>(); // constructor that makes a deck with arrayList of Cards
    }

    // overloaded constructor that takes a boolean of True
    // create a standard deck of 52 cards
    public Deck(boolean makeDeck) {
        deck = new ArrayList<Card>();
        if(makeDeck) {
             // iterate through enum suits
            for(Suit suit : Suit.values()) {
                // iterate through ranks
                for(Rank rank : Rank.values()) {
                    deck.add(new Card(suit, rank));
                }
            }
        }
    }
    
    // method to populate the deck
    public void addCard(Card card){
        deck.add(card);
    }

    public String toString(){
        String output = "";
        
        for(Card card: deck) {
            output += card;
            output += "\n";
        }
        return output;
    }

}