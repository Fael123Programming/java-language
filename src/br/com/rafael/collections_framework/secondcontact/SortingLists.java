package br.com.rafael.collections_framework.secondcontact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingLists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Marcelo");
        names.add("Sandro");
        names.add("Antonie");
        names.add("Bruno");
        names.add("Henry");
        names.add("Amanda");
        names.add("Andres");
        names.add(0, "Anne");
        names.forEach(e -> System.out.print(e + " "));
        Collections.sort(names); //Uses a type of mergesort and Tim Sort!
        System.out.println();
        names.forEach(e -> System.out.print(e + " "));
    }
}
