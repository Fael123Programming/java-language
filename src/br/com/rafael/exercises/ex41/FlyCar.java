package br.com.rafael.exercises.ex41;

public interface FlyCar {
    default int startEngine(EncryptedKey key) {
        return key.hashCode();
    }
}
