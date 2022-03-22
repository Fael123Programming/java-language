package br.com.rafael.exercises.ex33;

public class Deck {
    private final Card[][] cards;
    private static final int SUITS = 4, RANKS = 13, NUMBER_OF_CARDS = 52;

    {
        cards = new Card[SUITS][RANKS];
    }

    public Deck() {
        int diamondsNumber = Card.Suit.DIAMONDS.getNumber(), aceNumber = Card.Rank.ACE.getNumber();
        for (int suit = 0; suit < SUITS; suit++)
            for (int rank = 0; rank < RANKS; rank++)
                cards[suit][rank] = new Card(diamondsNumber + suit, aceNumber + rank);

    }

    public Card getCard(int suit, int rank) throws IllegalArgumentException {
        Card.checkIsValidSuit(suit);
        Card.checkIsValidRank(rank);
        return cards[suit - Card.Suit.DIAMONDS.getNumber()][rank - Card.Rank.ACE.getNumber()];
    }

    public String traverseDeck() {
        StringBuilder builder = new StringBuilder();
        int diamondsNumber = Card.Suit.DIAMONDS.getNumber();
        for (int suit = 0; suit < SUITS; suit++) {
            builder.append(Card.getSuitStringOf(diamondsNumber + suit)).append(" -> ");
            for (int rank = 0; rank < RANKS; rank++) {
                builder.append(cards[suit][rank].getStrRank());
                if (rank < RANKS - 1)
                    builder.append(", ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public int getSize() {
        return NUMBER_OF_CARDS;
    }
}
