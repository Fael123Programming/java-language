package br.com.rafael.nested_classes.lambda_expressions.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Garage {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
    }

    public Garage(Car...cars) {
        this.cars.addAll(List.of(cars));
    }

    public List<Car> list(Predicate<Car> predicate) {
        if (predicate == null)
            throw new IllegalArgumentException("predicate cannot be null");
        List<Car> matchedCars = new ArrayList<>();
        for (Car car : cars)
            if (predicate.test(car))
                matchedCars.add(car);
        return matchedCars;
    }

    public void processCars(Predicate<Car> predicate, Consumer<Car> consumer) {
//       Predicate does return a logic value according to a specific condition.
//       Consumer does not return any type.
        if (predicate == null || consumer == null)
            throw new IllegalArgumentException("arguments must be non-null");
        for (Car c : cars)
            if (predicate.test(c))
                consumer.accept(c);
    }
}
