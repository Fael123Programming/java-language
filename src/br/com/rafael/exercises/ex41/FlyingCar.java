package br.com.rafael.exercises.ex41;

public class FlyingCar implements OperateCar, FlyCar {
    public int startEngine(EncryptedKey key) {
        return OperateCar.super.startEngine(key) + FlyCar.super.startEngine(key);
    }
}
