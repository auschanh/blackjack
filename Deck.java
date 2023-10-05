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

    public int getSize() {
        return deck.size();
    }

    public void shuffle() {
        ArrayList<Card> shuffled = new  ArrayList<Card>();
        while(deck.size()>0) {
            // use Math.random() to generate a card from 0-51
            int pulledCard = (int)(Math.random()*(deck.size()));
            shuffled.add(deck.get(pulledCard)); // add pulledCard to our new shuffled deck
            deck.remove(pulledCard); // remove the pulledCard from the initialized deck

        }
        deck = shuffled;
        
    }

    public Card getCard(){
        Card topCard = new Card(deck.get(0)); // takes top card of from deck, uses card as parameter
        deck.remove(0);
        return topCard;
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