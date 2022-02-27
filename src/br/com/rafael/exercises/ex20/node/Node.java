package br.com.rafael.exercises.ex20.node;

import br.com.rafael.exercises.ex20.data_classes.Person;

public class Node {
    private Person person;
    private Node next;

    public Node (Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
