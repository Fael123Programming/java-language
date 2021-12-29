package br.com.rafael.exercises.ex07;

public class AreaCalculator {

//  The following method calculates the area of a square.
    public static double calculate(double sideLength) {
        return sideLength * sideLength;
    }

//  The following method calculates the area of a rectangle.
    public static double calculate(double length, double width) {
        return length * width;
    }

//  The following method calculates the area of a trapezium.
    public static double calculate(double firstBase, double secondBase, double height) {
        return (firstBase + secondBase) / 2 * height;
    }

//  The following method calculates the area of a rhombus.
    public static float calculate(float firstDiagonal, float secondDiagonal) {
        return firstDiagonal * secondDiagonal / 2;
    }
}
