package br.com.rafael.collections_framework.third_contact;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        //Todos os elementos de uma queue são ordenados de acordo com seus natural ordering.
        queue.add("Leandro Silva");
        queue.add("Maria Pereira");
        queue.add("Rafael Fonseca");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.remove("Rafael Fonseca"));
        System.out.println(queue.size());
    }
}
