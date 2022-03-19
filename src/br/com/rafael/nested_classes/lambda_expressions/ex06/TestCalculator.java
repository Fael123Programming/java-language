package br.com.rafael.nested_classes.lambda_expressions.ex06;

import br.com.rafael.nested_classes.lambda_expressions.ex06.Calculator.Operation;

public class TestCalculator {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mult = (a, b) -> a * b;
        Operation div = (a, b) -> {
            if (b == 0)
                throw new IllegalArgumentException("Cannot divide by zero");
            return a / b;
        };
        Operation pow = (a, b) -> Math.pow(a, b);
        Calculator calc = new Calculator(sum, sub, mult, div, pow);
        System.out.println(calc.calculate(10, 5, 3));
    }
}
