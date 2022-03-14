package br.com.rafael.exercises.ex29;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testVarargs("Baby", 100, false, 456.78);
        testVarargs();
    }

    private static void testVarargs(Object... objects) {
        for (Object obj : objects)
            System.out.println(obj);
        System.out.println(Arrays.toString(objects));
    }
}
