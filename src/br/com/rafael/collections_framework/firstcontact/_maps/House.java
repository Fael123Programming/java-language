package br.com.rafael.collections_framework.firstcontact._maps;

public class House {
    private final String color;
    private final int numberOfPorts;

    public House(String color, int numberOfPorts) {
        this.color = color;
        this.numberOfPorts = numberOfPorts;
    }

    public String info(){
        return "Color: " + color + "\nNumber of ports: " + numberOfPorts;
    }
}
