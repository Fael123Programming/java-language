package br.com.rafael.collections_framework.firstcontact.generics.applyinggenericsonaclass;

public class Main {
    public static void main(String[] args) {
        Node<String> n1 = new Node<>("node with a string as data");
        Node<Integer> n2 = new Node<>(300);
        Node<Float> n3 = new Node<>(3.14154f);
        Node<Double> n4 = new Node<>(1.23123412412341);
    }
}
