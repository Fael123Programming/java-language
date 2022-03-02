package br.com.rafael.interfaces.ex03;

public interface Bicycle {
//  All methods in an interface are public and static.

    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
