package br.com.rafael.exercises.ex06.calculator.classes;

import br.com.rafael.exercises.ex06.calculator.interface_.Operation;

public class Multiplication implements Operation {

    @Override
    public double calculate(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
}
