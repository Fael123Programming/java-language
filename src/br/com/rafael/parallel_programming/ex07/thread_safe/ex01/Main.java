package br.com.rafael.parallel_programming.ex07.thread_safe.ex01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> messages = new ArrayList<>(); //Not thread-safe collection.
        Thread th1 = new Thread(new MessageProducer(0, 10000, messages));
        Thread th2 = new Thread(new MessageProducer(10001, 20000, messages));
        Thread th3 = new Thread(new MessageProducer(20001, 30000, messages));
        th1.start();
        th2.start();
        th3.start();
        try {
            th1.join(); //Wait for these threads to die.
            th2.join();
            th3.join();
        } catch(InterruptedException ie) {
            System.out.println("A thread was interrupted.");
        }
        //Concurrent access to a not thread-safe object (the object messages).
        //The difference here is that we are using different message producers: they use thread locks
        //and synchronization among threads to avoid irregularities.
        //See that no problem was found and all messages were inserted aptly.
        System.out.println("Message creator threads finalized!");
        for (int i = 0; i <= 30000; i++) {
            if (!messages.contains("Message " + i)) {
                System.out.println("Message " + i + " was not added.");
            }
        }
        if (messages.contains(null)) {
            System.out.println("null was found.");
        }
    }
}
