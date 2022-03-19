package br.com.rafael.nested_classes.lambda_expressions.ex06;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Operation> operations;

    {
        operations = new ArrayList<>();
    }

    public Calculator(Operation... operations) {
        this.operations.addAll(List.of(operations));
    }

    @FunctionalInterface
    interface Operation {
        double operate(double a, double b);
    }

    public double calculate(double a, double b, int operationIndex) {
        if (operationIndex < 0 || operationIndex >= operations.size())
            throw new IllegalArgumentException("invalid operation index: " + operationIndex);
        Operation op = operations.get(operationIndex);
        return op.operate(a, b);
    }

    public double calculate(double a, double b, Operation op) {
        return op.operate(a, b);
    }

    public List<Operation> getOperations() {
        return operations;
    }
}
