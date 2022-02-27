package br.com.rafael.exercises.ex20.tests;

import br.com.rafael.exercises.ex20.data_classes.Address;
import br.com.rafael.exercises.ex20.data_classes.Person;
import br.com.rafael.exercises.ex20.node.Node;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(new Person("Rafael Fonseca", new Address("Brazil", "Piracanjuba",
                "Rua Brasil", (short) 567), LocalDate.now()));
        Node n2 = new Node(new Person("Marinna Silva", new Address("France", "Montpelier",
                "La bride", (short) 111), LocalDate.now()));
        Node n3 = new Node(new Person("John Wesley", new Address("USA", "New York",
                "St. Stuart Avenue", (short) 10), LocalDate.now()));
        n1.setNext(n2);
        n2.setNext(n3);
        Node current = n1;
        while (current != null) {
            System.out.println(current.getPerson());
            current = current.getNext();
        }
        System.out.println(n1.getNext().getNext().getPerson());
    }
}
