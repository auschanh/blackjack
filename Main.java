public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack");
        Game blackjack = new Game();
        Deck newDeck = new Deck();

        Card aCard = new Card(Suit.CLUB, Rank.ACE);
        Card bCard = new Card(Suit.DIAMOND, Rank.TWO);
        Card cCard = new Card(Suit.HEART, Rank.TEN);

        newDeck.addCard(aCard);
        newDeck.addCard(bCard);
        newDeck.addCard(cCard);

        System.out.println(newDeck);
    }
}