package br.com.rafael.parallel_programming.ex07.thread_safe.ex01;

import java.util.Collection;

public class MessageProducer implements Runnable {
    private final int begin, end;
    private final Collection<String> messages;

    public MessageProducer(int begin, int end, Collection<String> messages) {
        this.begin = begin;
        this.end = end;
        this.messages = messages;
    }

    @Override
    public void run(){
        for (int i = begin; i <= end; i++)
            synchronized(messages) {
                //When a thread is on this critic area, no other threads will be allowed to access it.
                messages.add("Message " + i);
            }
    }
}
