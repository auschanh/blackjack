public class Game {

    private Deck deck, discarded;
    private Dealer dealer;
    private Player player;
    // pushes are ties or draws
    private int wins, losses, pushes;

    // Constructor
    public Game() {
        wins = 0; losses = 0; pushes = 0;
    }
    
}