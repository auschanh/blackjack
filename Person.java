public abstract class Person {
    // abstract class because the game will only create Dealer or Player objects
    private String name;
    private Hand hand;

    public Person() {
        this.name = "";
        this.hand = new Hand();
    }

    public boolean hasBlackJack() {
        if(this.getHand().handValue() == 21) {
            return true;
        } 
        else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void printHand() {
        System.out.println(name + "'s hand contains this:");
        System.out.println(hand + " Valued at: " + hand.handValue());
    }

    public void hit(Deck deck, Deck discard) {
        // player decided to hit
        // need to check if deck has cards in it
        if(deck.isEmpty()){
            deck.reloadDeck(discard);
        }
        hand.drawCard(deck);
        System.out.println(name + " drew a card");
        printHand();
    }
}