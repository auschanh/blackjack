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

        if(wins>0 || losses>0 || pushes> 0){
            System.out.println();
            System.out.println("Starting the Next Round... Wins: " + wins + " Losses: " + losses + " Pushes: " + pushes);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
            // both players discard their hand into the discarded pile
            dealer.getHand().discardHand(discarded);
            player.getHand().discardHand(discarded);
        }

        if(deck.getSize() < 4) {
            deck.reloadDeck(discarded);
        }

        // each player draws 2 cards
        dealer.getHand().drawCard(deck);
        dealer.getHand().drawCard(deck);
        player.getHand().drawCard(deck);
        player.getHand().drawCard(deck);

        // show hands
        dealer.printFirstCard();
        player.printHand();
        
        // check if either player has Blackjack, then show hand
        if(dealer.hasBlackJack()) {
            dealer.printHand();
            if(player.hasBlackJack()) {
                System.out.println("You both have a Blackjack (21)! - RESULT: Push/Tie 😐\n");
                pushes++;
                startRound();
            }
            else {
                System.out.println("Dealer has Blackjack (21). RESULT: Loss. ❌\n");
                dealer.printHand();
                losses++;
                startRound();
            }
        }
        if(player.hasBlackJack()) {
            System.out.println("You have a Blackjack (21). RESULT: Win. ✅\n");
            wins++;
            startRound();
        }

        // player makes choice
        // in Player class this is a while loop
        player.makeDecision(deck, discarded);

        if(player.getHand().handValue() > 21){
            System.out.println("BUST! Your hand is over 21. 💣 ❌");
            losses++;
            startRound();
        }

        // dealer's turn
        // neither player has blackjack at this point and player has made their choice.
        dealer.printHand();
        while(dealer.getHand().handValue() < 17){
            dealer.hit(deck, discarded);
        }

        // check who won
        if(dealer.getHand().handValue() > 21) {
            System.out.println("Dealer busts 💣");
            wins++;
        } else if(dealer.getHand().handValue() > player.getHand().handValue()){
            System.out.println("The dealer won ❌");
            losses++;
        } else if(dealer.getHand().handValue() < player.getHand().handValue()){
            System.out.println("You won ✅");
            wins++;
        }
        else {
            System.out.println("Push/Tie. 😐");
            pushes++;
        }
        startRound();

    }

}