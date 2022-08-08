package br.com.rafael.collections_framework.third_contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestCountry {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Brazil"));
        countries.add(new Country("USA"));
        countries.add(new Country("Switzerland"));
        countries.add(new Country("France"));
        print(countries);
        Collections.sort(countries);
        print(countries);
        System.out.println(Collections.binarySearch(countries, new Country("Canada")));
        //-(position)-1
    }

    private static void print(List<?> list) {
        System.out.println();
        System.out.println("-------------------------------------------------------");
        list.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        System.out.println();
    }
}
