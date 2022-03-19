package br.com.rafael.nested_classes.lambda_expressions.ex05;

import java.util.Objects;
import java.util.function.*;

public class DataHandler {
    public static <X, Y> void processElements(
            Iterable<X> iterable,
            Predicate<X> predicate,
            Consumer<Y> consumer,
            Function<X, Y> function
    ) {
        Objects.requireNonNull(iterable);
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(consumer);
        Objects.requireNonNull(function);
        for (X x : iterable)
            if (predicate.test(x))
                consumer.accept(function.apply(x));
    }
}
