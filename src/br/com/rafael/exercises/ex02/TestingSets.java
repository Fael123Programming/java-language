package br.com.rafael.exercises.ex02;

import java.util.TreeSet;

public class TestingSets {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i <= 30; i++)
            numbers.add(i);
        for (Integer i : numbers.descendingSet())
            System.out.println(i.intValue());
    }
}
