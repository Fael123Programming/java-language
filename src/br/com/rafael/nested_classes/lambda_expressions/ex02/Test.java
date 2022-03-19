package br.com.rafael.nested_classes.lambda_expressions.ex02;

import br.com.rafael.nested_classes.lambda_expressions.ListPrinter;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Chevrolet", "S10");
        Car c2 = new Car("Chevrolet", "Onyx");
        Car c3 = new Car("Ford", "Ranger");
        Car c4 = new Car("Volkswagen", "Gol");
        Car c5 = new Car("Toyota", "Hilux");
        Garage g = new Garage(c1, c2, c3, c4, c5);
        ListPrinter<Car> printer = new ListPrinter<>();
        printer.print(g.list((Car c) -> {
            int id = c.getId();
            return 1 <= id && id <=3;
        }));
        printer.print(g.list((Car c) -> c.getBrand().equalsIgnoreCase("chevrolet")));
    }
}
