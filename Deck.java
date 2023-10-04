import java.util.ArrayList;

public class Deck {
    // manages the deck of cards with an arrayList
    private ArrayList<Card> deck;
    
    public Deck(){
        deck = new ArrayList<Card>(); // constructor that makes a deck with arrayList of Cards
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