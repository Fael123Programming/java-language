package br.com.rafael.nested_classes.lambda_expressions.ex05;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> names = List.of("Rafael", "Eric", "Jordana", "Jair Bolsonaro", "Judite", "Marcos");
        DataHandler.processElements(
                names,
                (s) -> s.length() == 6,
                (uppercaseName) -> System.out.println(uppercaseName),
                (s) -> s.toUpperCase()
        );
        System.out.println("");
        names.stream().filter(s -> s.contains("it")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
//  Filter plays the role of the Predicate (logic evaluation).
//  Map plays the role of the Function (receives a data and returns another one).
//  forEach plays the role of the Consumer (do something on certain data not returning anything).
//  The operations filter, map, and forEach are aggregate operations.
//  Aggregate operations process elements from a stream, not directly from a collection (which is the reason why
//  the first method invoked in this example is stream). A stream is a sequence of elements. Unlike a collection,
//  it is not a data structure that stores elements. Instead, a stream carries values from a source, such
//  as collection, through a pipeline. A pipeline is a sequence of stream operations, which in this example is
//  filter- map-forEach. In addition, aggregate operations typically accept lambda expressions as parameters,
//  enabling you to customize how they behave.
//  You can omit the data type of the parameters in a lambda expression. In addition, you can omit the parentheses
//  if there is only one parameter.
//  Lambda expression does not introduce a new level of scoping. Consequently, you can directly access fields, methods,
//  and local variables of the enclosing scope.
//  You can serialize a lambda expression if its target type and its captured arguments are serializable. However,
//  like inner classes, the serialization of lambda expressions is strongly discouraged.
    }
}
