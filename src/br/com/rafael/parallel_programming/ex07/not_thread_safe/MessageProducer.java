package br.com.rafael.parallel_programming.ex07.not_thread_safe;

import java.util.*;

public class MessageProducer implements Runnable {
    private int begin, end;
    private Collection<String> messages;

    public MessageProducer(int begin, int end, Collection<String> messages) {
        this.begin = begin;
        this.end = end;
        this.messages = messages;
    }

    public void run(){
        for (int i = begin; i <= end; i++)
            messages.add("Message " + i);
    }
}
