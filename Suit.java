public enum Suit {
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");

    String suitName;
    // constructor that takes a suitName
    Suit(String suitName) {
        this.suitName = suitName;
    }
    public String toString() {
        return suitName; // returns clubs, diamonds, hearts or spades
    }
}
