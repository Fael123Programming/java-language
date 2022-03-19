package br.com.rafael.serialization.ex03;

import br.com.rafael.serialization.ex03.Car.Engine;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Car c = new Car(
                new Engine("MAXC", "V8 6y", 500),
                "Chevrolet",
                "Camaro SS",
                "Yellow",
                LocalDate.now()
        );
        CarSerializer serializer = new CarSerializer();
        serializer.serialize(c);
        CarDeserializer deserializer = new CarDeserializer();
        System.out.println(deserializer.deserialize());
    }
}
