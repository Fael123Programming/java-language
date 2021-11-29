package br.com.rafael.math_class;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(9.123));
        System.out.println(cbrt(9.123));
        System.out.println(pow(sqrt(9.123),2));
        System.out.println(sin(toRadians(90)));
        System.out.println(sin(toRadians(45)));
        System.out.println(sin(toRadians(30)));
        System.out.println(factInt(16));
        System.out.println(factLong(20));
    }

    private static int factInt(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++)
            result *= i;
        return result;
    }

    private static long factLong(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++)
            result *= i;
        return result;
    }
}
