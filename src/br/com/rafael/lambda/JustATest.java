package br.com.rafael.lambda;

//Functional interface: only one method shall be implemented by implementors.
//Passable of being used with lambda expression.

@FunctionalInterface
public interface JustATest {
    void method1(String message, int integerNumber, double floatingNumber, boolean logicValue);
}
