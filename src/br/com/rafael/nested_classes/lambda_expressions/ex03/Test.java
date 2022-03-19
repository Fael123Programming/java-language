package br.com.rafael.nested_classes.lambda_expressions.ex03;

import br.com.rafael.nested_classes.lambda_expressions.ex02.Car;
import br.com.rafael.nested_classes.lambda_expressions.ex02.Garage;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Chevrolet", "S10");
        Car c2 = new Car("Chevrolet", "Onyx");
        Car c3 = new Car("Ford", "Ranger");
        Car c4 = new Car("Volkswagen", "Gol");
        Car c5 = new Car("Toyota", "Hilux");
        Garage g = new Garage(c1, c2, c3, c4, c5);
        g.processCars((Car c) -> c.getBrand().equalsIgnoreCase("ford"), (Car c) -> System.out.println(c));
    }
}
