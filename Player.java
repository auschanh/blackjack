public class Player extends Person {
    public Player() {
        super.setName("Player");
    }

    public boolean hasBlackJack() {
        if(this.getHand().handValue() == 21) {
            return true;
        } 
        else {
            return false;
        }
    }
}