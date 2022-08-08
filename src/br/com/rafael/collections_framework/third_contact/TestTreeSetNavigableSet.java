package br.com.rafael.collections_framework.third_contact;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestTreeSetNavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        //NavigableSet precisa de um comparable como objetos a serem guardados.
        //Usando um TreeSet, os elementos permanecem ordenados após cada inserção.
        set.add(100);
        set.add(2);
        set.add(30);
//        set.forEach(System.out::println);
//        set.descendingSet().forEach(System.out::println);
//        System.out.println(set.lower(30));
//        System.out.println(set.higher(30));
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
