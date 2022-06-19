package br.com.rafael.exercises.ex33;

import java.util.Objects;
public class Card {
    private final int rank;
    private final int suit;

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
            case 1 -> "ACE";
            case 2 -> "DEUCE";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            case 10 -> "TEN";
            case 11 -> "JACK";
            case 12 -> "QUEEN";
            case 13 -> "KING";
          default -> "unknown";
        };
    }

    public static String getSuitStringOf(int suit) {
        return switch(suit) {
            case 14 -> "DIAMONDS";
            case 15 -> "CLUBS";
            case 16 -> "HEARTS";
            case 17 -> "SPADES";
            default -> "unknown";
        };
    }

    public static void checkIsValidRank(int rank) throws IllegalArgumentException {
        if (rank < 1 || rank > 13)
            throw new IllegalArgumentException("invalid rank: " + rank);
    }

    public static void checkIsValidSuit(int suit) throws IllegalArgumentException {
        if (suit < 14 || suit > 17)
            throw new IllegalArgumentException("invalid suit: " + suit);
    }

    @Override
    public String toString() {
        return getStrRank() + " of " + getStrSuit();
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (!(anotherObject instanceof Card anotherObjectCasted)) {
            return false;
        }
        return suit == anotherObjectCasted.suit && rank == anotherObjectCasted.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank); //'(suit - 1) * 13 + rank' would work properly as well.
    }

    public enum Rank {
        ACE(1), DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6),
        SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12),
        KING(13);

        final int number;

        Rank(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public enum Suit {
        DIAMONDS(14), CLUBS(15), HEARTS(16), SPADES(17);

        final int number;

        Suit(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }
}
