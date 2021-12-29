package br.com.rafael.exercises.ex06.calculator.classes;

import br.com.rafael.exercises.ex06.calculator.interface_.Operation;

public class Division implements Operation {

    @Override
    public double calculate(double firstOperand, double secondOperand) throws IllegalArgumentException {
        if (secondOperand == 0)
            throw new IllegalArgumentException("cannot divide by zero");
        return firstOperand / secondOperand;
    }
}
