package br.com.rafael.exercises.ex33;

public class Card {
    private final int rank;
    private final int suit;

//  Kinds of ranks
    public static final int ACE = 1;
    public static final int DEUCE = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

//  Kinds of suits
    public static final int DIAMONDS = 14;
    public static final int CLUBS = 15;
    public static final int HEARTS = 16;
    public static final int SPADES = 17;


    public Card(int suit, int rank) throws IllegalArgumentException {
        checkIsValidSuit(suit);
        checkIsValidRank(rank);
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String getStrRank() {
        return Card.getRankStringOf(rank);
    }

    public String getStrSuit() {
        return Card.getSuitStringOf(suit);
    }

    public static String getRankStringOf(int rank) {
        return switch(rank) {
          case ACE -> "ACE";
          case DEUCE -> "DEUCE";
          case THREE -> "THREE";
          case FOUR -> "FOUR";
          case FIVE -> "FIVE";
          case SIX -> "SIX";
          case SEVEN -> "SEVEN";
          case EIGHT -> "EIGHT";
          case NINE -> "NINE";
          case TEN -> "TEN";
          case JACK -> "JACK";
          case QUEEN -> "QUEEN";
          case KING -> "KING";
          default -> "unknown";
        };
    }

    public static String getSuitStringOf(int suit) {
        return switch(suit) {
            case DIAMONDS -> "DIAMONDS";
            case CLUBS -> "CLUBS";
            case HEARTS -> "HEARTS";
            case SPADES -> "SPADES";
            default -> "unknown";
        };
    }

    public static void checkIsValidRank(int rank) throws IllegalArgumentException {
        if (rank < ACE || rank > KING)
            throw new IllegalArgumentException("invalid rank: " + rank);
    }

    public static void checkIsValidSuit(int suit) throws IllegalArgumentException {
        if (suit < DIAMONDS || suit > SPADES)
            throw new IllegalArgumentException("invalid suit: " + suit);
    }

    @Override
    public String toString() {
        return getStrRank() + " of " + getStrSuit();
    }
}
