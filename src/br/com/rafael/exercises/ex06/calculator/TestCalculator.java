package br.com.rafael.exercises.ex06.calculator;

import br.com.rafael.exercises.ex06.calculator.classes.*;

public class TestCalculator {
    public static void main(String... args) {
        Calculator cal = new Calculator(new Division());
        System.out.println(cal.calculate(45, 6.78));
        cal.setOperation(new Sum());
        System.out.println(cal.calculate(12.67, 89.56));
        cal.setOperation(new Division());
        System.out.println(cal.calculate(10, 0));
    }
}
