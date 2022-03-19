package br.com.rafael.nested_classes.lambda_expressions.ex02;

public class Car {
    private static int index;
    private final String brand, model;
    private final int id;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.id = ++index;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", model=" + model + ", id=" + id;
    }
}
