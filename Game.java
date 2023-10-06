public class Game {

    private Deck deck, discarded;
    private Dealer dealer;
    private Player player;
    // pushes are ties or draws
    private int wins, losses, pushes;

    // Constructor
    public Game() {
        wins = 0; losses = 0; pushes = 0;

        deck = new Deck(true); // standard 52 card deck
        discarded = new Deck(); // empty deck

        dealer = new Dealer();
        player = new Player();

        deck.shuffle();
        startRound();
    }

    private void startRound() {

        // each player draws 2 cards
        dealer.getHand().drawCard(deck);
        dealer.getHand().drawCard(deck);
        player.getHand().drawCard(deck);
        player.getHand().drawCard(deck);

        dealer.printFirstCard();
        player.printHand();
        
        if(dealer.hasBlackJack()) {
            dealer.printHand();
            if(player.hasBlackJack()) {
                System.out.println("You both have a Blackjack (21)! - RESULT: Push/Tie\n");
                pushes++;
                startRound();
            }
            else {
                System.out.println("Dealer has Blackjack (21). RESULT: Loss.\n");
                dealer.printHand();
                losses++;
                startRound();
            }
        }
        if(player.hasBlackJack()) {
            System.out.println("You have a Blackjack (21). RESULT: Win.\n");
            wins++;
            startRound();
        }
        player.makeDecision(deck, discarded);
    }

}