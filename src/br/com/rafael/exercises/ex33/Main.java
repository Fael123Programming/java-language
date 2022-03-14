package br.com.rafael.exercises.ex33;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.traverseDeck());
        System.out.println(deck.getCard(Card.DIAMONDS, Card.KING));
        System.out.println(deck.getCard(Card.SPADES, Card.QUEEN));
    }
}
