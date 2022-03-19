package br.com.rafael.serialization.ex03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class CarSerializer {
    public void serialize(Car car) {
        Objects.requireNonNull(car, "car cannot be null");
        final String PATH = "src/br/com/rafael/serialization/ex03/car.ser";
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
