public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack");
        Game blackjack = new Game();
        Card testCard = new Card(Suit.CLUB, Rank.ACE);
        System.out.println(testCard);
    }
}