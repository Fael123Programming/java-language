package br.com.rafael.collections_framework.secondcontact;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestingIterators {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println("Removing all even numbers...");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(numbers);
        System.out.println("Now removing all multiples of 5...");
        it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() % 5 == 0) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
