package br.com.rafael.parallel_programming.ex07.thread_safe.ex03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> messages = new ArrayList<>();
        Thread th1 = new Thread(new MessageProducer(0, 10000, messages));
        Thread th2 = new Thread(new MessageProducer(10001, 20000, messages));
        Thread th3 = new Thread(new MessageProducer(20001, 30000, messages));
        th1.start();
        th2.start();
        th3.start();
        try {
            th1.join();
            th2.join();
            th3.join();
        } catch(InterruptedException ie) {
            System.out.println("A thread was unexpectedly interrupted");
        }
        for (int i = 0; i <= 30000; i++)
            if (!(messages.contains("Message " + i)))
                System.out.println("Message " + i + " was not found.");
        if (messages.contains(null))
            System.out.println("null was found.");
        //It did not work because we locked only the access to the method run() on each message producer,
        //but we have to lock the access to messages (an object of the class ArrayList).
    }
}
