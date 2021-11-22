package br.com.rafael.parallel_programming.ex07.thread_safe.ex03;

import java.util.Collection;

public class MessageProducer implements Runnable {
    private final int begin, end;
    private final Collection<String> messages; //Always program to the interface!

    public MessageProducer(int begin, int end, Collection<String> messages) {
        this.begin = begin;
        this.end = end;
        this.messages = messages;
    }

    public synchronized void run() {
        //It will not lock the access to messages but the access to this method only.
        //Then, it did not work!
        for (int i = begin; i <= end; i++)
            messages.add("Message " + i);
    }
}
