import java.util.ArrayList;

// Hand class handles logic for calculating hand value
// draw cards from deck, discard hand methods
public class Hand {
    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void drawCard(Deck deck) {
        hand.add(deck.getCard());
    }

    public int handValue() {
        // get rank of each card in hand and add
        // if ACE, handValue > 21 ACE is 1 otherwise 11
        int value = 0;
        int aceCount = 0; // by default ACE values are 11
        
        for(Card card : hand) {
            value += card.getValue();
            if(card.getValue() == 11) {
                aceCount++;
            }
        }
        // check if value is over 21 and if there are aces in hand
        if (value > 21 && aceCount > 0) {
            // may have multiple aces in hand that need to be 1 for a valid hand
            while(aceCount > 0 && value > 21) {
                aceCount--;
                value -= 10;
            }
        }
        return value;
    }

    public String toString() {
        String output = "";
        for(Card card : hand) {
            output += card + " - ";
        }
        return output;
    }
}