public enum Suit {
    CLUB("Clubs", "♧"),
    DIAMOND("Diamonds", "♢"),
    HEART("Hearts", "♡"),
    SPADE("Spades", "♤");

    String suitName;
    String suitSymbol;
    // constructor that takes a suitName
    Suit(String suitName, String suitSymbol) {
        this.suitName = suitName;
        this.suitSymbol = suitSymbol;
    }
    public String toString() {
        return suitName; // returns clubs, diamonds, hearts or spades
    }
}
