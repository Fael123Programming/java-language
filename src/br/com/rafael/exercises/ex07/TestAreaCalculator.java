package br.com.rafael.exercises.ex07;

public class TestAreaCalculator {
    public static void main(String[] args) {
        System.out.println("Square area: " + AreaCalculator.calculate(3));
        System.out.println("Rectangle area: " + AreaCalculator.calculate(5.41d, 3.78d));
        System.out.println("Trapezium area: " + AreaCalculator.calculate(7, 8, 9));
        System.out.println("Rhombus area: " + AreaCalculator.calculate(5.41f, 3.78f));
    }
}
