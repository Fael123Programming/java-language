package br.com.rafael.annotations.ex03;

public class Main {
    public static void main(String[] args) {
        Habitable h = new House();
        h.open();
        h.openBackDoor();
        h.openFrontDoor();
    }
}
