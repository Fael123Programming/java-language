package br.com.rafael.annotations.ex03;

public class House implements Habitable {
    @Override
    @SuppressWarnings("deprecation")
    public void open() {
        System.out.println("House was opened");
    }

    @Override
    public void openFrontDoor() {
        System.out.println("Front door opened");
    }

    @Override
    public void openBackDoor() {
        System.out.println("Back door opened");
    }
}
