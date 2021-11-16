package br.com.rafael.collections_framework.exercises.challenges;

import br.com.rafael.collections_framework.exercises.challenges.comparator.decreasingOrder;

import br.com.rafael.time.Time;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int []oneToThousand = new int[1000];
        for (int i = 0; i < 1000; i++) {
            oneToThousand[i] = i + 1; //From 1 to 1000.
        }
        TreeSet<Integer> numbers = new TreeSet<>(new decreasingOrder()); //Lambda expression would be (o1, o2) -> Integer.compare(o1,o2) * -1
        //A comparator was passed to the constructor of this set to change its elements natural ordering based on the method compare(Integer,Integer).
        Time.startCounting();
        for (int i = 0; i < 1000; i++) {
            numbers.add(oneToThousand[i]);
            //It adds ordering its elements based on the natural ordering of them or by a
            //comparator passed through constructor.
        }
        Time.finishCounting();
        System.out.println("-----------------------");
        System.out.println("Add: " + Time.getTime());
        Time.startCounting();
        for (int i : numbers) {
            System.out.println(i);
        }
        Time.finishCounting();
        System.out.println("Access: " + Time.getTime());
        System.out.println("-----------------------");
        ArrayList<Integer> numbers2 = new ArrayList<>();
        Time.startCounting();
        for (int i = 999; i >= 0; i--) {
            numbers2.add(oneToThousand[i]);
        }
        Time.finishCounting();
        System.out.println("Add: " + Time.getTime());
        Time.startCounting();
        for (int i : numbers2) {
            System.out.println(i);
        }
        Time.finishCounting();
        System.out.println("Access: " + Time.getTime());
        System.out.println("-----------------------");
    }
}
