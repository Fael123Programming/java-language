package br.com.rafael.collections_framework.secondcontact;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class SearchingItems {
    public static void main(String... args) {
        List<Game> games = new ArrayList<>();
        games.add(new Game("GTA V"));
        games.add(new Game("FIFA 22"));
        games.add(new Game("Red Dead Redemption II"));
        games.add(new Game("The Witcher III"));
        games.add(new Game("Hearthstone"));
        Collections.sort(games);
        for (Game g : games) {
            System.out.println(g);
        }
        System.out.println("Hearthstone is at position " + Collections.binarySearch(games, new Game("Hearthstone")));
        Game toSearchFor = new Game("Super Mario Bros");
        System.out.println(Collections.binarySearch(games, toSearchFor));
        //When not found, Collections.binarySearch() returns: (- (insertion point) - 1).
        Comparator<Game> comparator = new Game.GameNameDescendingComparator();
        games.sort(comparator);
        for (Game g : games) {
            System.out.println(g);
        }
        System.out.println(Collections.binarySearch(games, toSearchFor, comparator));
    }
}
