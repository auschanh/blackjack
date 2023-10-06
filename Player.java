import java.util.Scanner;

public class Player extends Person {
    Scanner input = new Scanner(System.in);

    public Player() {
        super.setName("Player");
    }

    public void makeDecision(Deck deck, Deck discard) {
        // ask player for: 1 for hit 2 for stand
        int decision = 0;
        boolean getNum = true;
        String quit = "";

        while(getNum) {
            try {
                System.out.println("PRESS: [1] Hit or [2] Stand - [3] Quit Game");
                decision = input.nextInt();
                getNum = false;
            }
            catch(Exception e) {
                System.out.println("Invalid input, please press [1] or [2]");
                input.next();
            }
        }
        if(decision == 3) {
            System.out.println("Thanks for playing Blackjack!");
            System.exit(0);
        }
        
        if(decision == 1) {
            super.hit(deck, discard);
            if(this.getHand().handValue() > 20) {
                return; // bust, we already check in game class if player has exactly 21
            }
            else {
                this.makeDecision(deck, discard);
            }
        } else {
            System.out.println("You stand.\n");
        } 

    }
}