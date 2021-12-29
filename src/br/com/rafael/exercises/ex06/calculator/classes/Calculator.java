package br.com.rafael.exercises.ex06.calculator.classes;

import br.com.rafael.exercises.ex06.calculator.interface_.Operation;

//Calculator using the gof design pattern Strategy.
//(https://refactoring.guru/design-patterns/strategy)

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double firstOperand, double secondOperand) {
        return this.operation.calculate(firstOperand, secondOperand);
    }

    public Operation getOperation(){
        return this.operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
