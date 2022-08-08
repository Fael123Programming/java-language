package br.com.rafael.collections_framework.third_contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestConvertingArraysAndLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);
        Integer[] numbersArray = new Integer[numbers.size()];
        numbers.toArray(numbersArray);
        System.out.println(Arrays.toString(numbersArray));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(numbersArray));
        numbers2.add(1000);
        System.out.println(numbers2);
    }
}
