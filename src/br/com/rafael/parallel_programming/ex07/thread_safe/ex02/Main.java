package br.com.rafael.parallel_programming.ex07.thread_safe.ex02;

import br.com.rafael.parallel_programming.ex07.not_thread_safe.MessageProducer;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> messages = new Vector<>(); //A thread-safe object.
        //See that here we are not using thread locks implemented by us but only
        //that given from class Vector.
        Thread th1 = new Thread(new MessageProducer(0, 10000, messages));
        Thread th2 = new Thread(new MessageProducer(10001, 20000, messages));
        Thread th3 = new Thread(new MessageProducer(20001, 30000, messages));
        th1.start();
        th2.start();
        th3.start();
        try {
            th1.join(); //This method makes that the current thread running these threads waits for all of them
            th2.join(); //to completely execute their activities and die.
            th3.join();
        } catch(InterruptedException ie) {
            System.out.println("A thread was interrupted unexpectedly");
        }
        for (int i = 0; i <= 30000; i++)
            if (!(messages.contains("Message " + i)))
                System.out.println("Message " + i + " was not found");
        if (messages.contains(null))
            System.out.println("null was found.");
        //Everything went nice due the class Vector which uses synchronization already.
    }
}
