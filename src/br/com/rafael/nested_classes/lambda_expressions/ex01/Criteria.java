package br.com.rafael.nested_classes.lambda_expressions.ex01;

//A functional interface is any interface that contains only one abstract method. (A functional interface may contain
//one or more default methods or static methods). Because a functional interface contains only one abstract method,
//you can omit the name of that method when you implement it. To do this, instead of using an anonymous class
//expression, you use a lambda expression.

@FunctionalInterface
public interface Criteria {
    boolean check(Person p);
}
