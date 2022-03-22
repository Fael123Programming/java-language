package br.com.rafael.exercises.ex33;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.traverseDeck());
        System.out.println(deck.getCard(Card.Suit.DIAMONDS.number, Card.Rank.KING.number));
        System.out.println(deck.getCard(Card.Suit.SPADES.number, Card.Rank.QUEEN.number));
    }
}
