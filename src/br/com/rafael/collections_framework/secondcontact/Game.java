package br.com.rafael.collections_framework.secondcontact;

import java.util.Comparator;
import java.util.Objects;

public class Game implements Comparable<Game> {
    private final String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object another) {
        if (!(another instanceof Game otherCasted)) {
            return false;
        }
        return otherCasted.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public int compareTo(Game anotherGame) {
        return this.name.compareTo(anotherGame.name);
    }

    public static class GameNameDescendingComparator implements Comparator<Game> {
        @Override
        public int compare(Game g1, Game g2) {
            return g1.compareTo(g2) * -1; //Descending comparator.
        }
    }
}
