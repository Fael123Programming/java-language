package br.com.rafael.exercises.ex41;

public interface OperateCar {
    default int startEngine(EncryptedKey key) {
        return key.hashCode(); //Simple example...
    }
}
