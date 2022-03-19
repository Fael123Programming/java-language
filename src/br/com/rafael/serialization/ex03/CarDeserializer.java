package br.com.rafael.serialization.ex03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarDeserializer {
    public Car deserialize() {
        final String PATH = "src/br/com/rafael/serialization/ex03/car.ser";
        Car car = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATH))) {
            car = (Car) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }
}
