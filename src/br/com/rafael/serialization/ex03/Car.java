package br.com.rafael.serialization.ex03;

import java.io.*;
import java.time.LocalDate;

public class Car implements Serializable {
    private transient Engine engine;
    private String brand, model, color;
    private LocalDate manufacturingDate;

    public Car(Engine engine, String brand, String model, String color, LocalDate manufacturingDate) {
        this.engine = engine;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufacturingDate = manufacturingDate;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public String toString() {
        return "{brand=" + brand + ", model=" + model + ", color=" + color + ", engine=" + engine +
                ", manufacturingDate=" + manufacturingDate + "}";
    }

//  As Engine is not serializable we will have to implement manually a way
//  to serialize an Engine's instance's data.

    //  This method will be called when serializing an instance of this class.
    @Serial
    private void writeObject(ObjectOutputStream outputStream) {
        try {
            outputStream.defaultWriteObject(); //Write all serializable object's data normally.
//          Write engine's data manually...
            outputStream.writeUTF(engine.brand);
            outputStream.writeUTF(engine.model);
            outputStream.writeInt(engine.potency);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //  This method will be called when deserializing an instance of this class once serialized.
    @Serial
    private void readObject(ObjectInputStream inputStream) {
        try {
            inputStream.defaultReadObject(); //Read all serializable object's data normally.
//          Read engine's data manually...
            engine = new Engine(inputStream.readUTF(), inputStream.readUTF(), inputStream.readInt());
//          Pay twice more attention to the order you are writing the data and reading it.
//          It must match!
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static class Engine {
        private String brand, model;
        private int potency;

        public Engine(String brand, String model, int potency) {
            this.brand = brand;
            this.model = model;
            this.potency = potency;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getPotency() {
            return potency;
        }

        public void setPotency(int potency) {
            this.potency = potency;
        }

        @Override
        public String toString() {
            return "{brand=" + brand + ", model=" + model + ", potency=" + potency + "}";
        }
    }
}
