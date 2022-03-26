package br.com.rafael.collections_framework.firstcontact.generics.unknownwildcards;

import br.com.rafael.exercises.ex19.IntegerType;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<IntegerType> integers = new ArrayList<>();
        integers.add(new IntegerType(100));
        integers.add(new IntegerType(200));
        integers.add(new IntegerType(30));
        integers.add(new IntegerType(10));
        List<String> strings = new LinkedList<>();
        strings.add("Java");
        strings.add("JavaScript");
        strings.add("Python");
        strings.add("Ruby");
        strings.add("PHP");
        printList(integers);
        printList(strings);

    }

    public static void printList(List<?> aList) { //Unknown wildcard! It does not matter which type we are handling!
        for (Object object : aList)
            System.out.println(object);
    }
}
