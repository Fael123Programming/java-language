package br.com.rafael.collections_framework.third_contact;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSetLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("String 1");
        set.add("String 2");
        set.add("String 3");
        //set.add("String 3"); Duplicates won't stand!
        for (String s : set) { //Insertion order aren't assured.
            System.out.println(s);
        }
        //With LinkedHashSet, insertion order is assured.
    }
}
