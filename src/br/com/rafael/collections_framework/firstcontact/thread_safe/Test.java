package br.com.rafael.collections_framework.firstcontact.thread_safe;

import java.util.*;

public class Test {
//    If you want to keep your data in a thread-safe way, use Vector in place of ArrayList
//    and Hashtable in place of HashMap.
//    You do not have to always use locks on your programs because it can increase the cost
//    of it considerably so use it only when really needed.
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(); //Thread-safe collection.
        numbers.add(600);
        numbers.add(0, 900);
        numbers.add(123);
        numbers.forEach(System.out::println); //Method reference.
        System.out.println("-----------------------------------------");
        Map<Integer, String> data = new Hashtable<>(); //Thread-safe also.
        data.put(892, "Info 1");
        data.put(100, "Info 2");
        data.put(99, "Info 3");
        data.forEach((key, value) -> System.out.println(key + " -> " + value)); //Lambda expression.
        Thread t = new Thread(() -> System.out.println("Testing stop() method"));
        t.start();
    }
}
