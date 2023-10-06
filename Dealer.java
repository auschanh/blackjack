public class Dealer extends Person {

    public Dealer() {

        super.setName("Dealer");
    }

    public void printFirstCard() {
        System.out.println("The dealer's hand contains:");
        System.out.println(super.getHand().getCard(0));
        System.out.println("The second card is face down.\n");
    }
}