package br.com.rafael.switch_restrictions;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Switch only works with the following data types:");
        System.out.println("char, byte, short, int, Character, Byte, Short, Integer, String or enum");
        System.out.println("### boolean, long, float, double, Boolean, Long, Float and Double are not allowed ###");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Give me an integer: ");
            int number = input.nextInt();
            switch (number) {
                case 1, 2, 3 -> System.out.println("Right guess");
                case 4 -> System.out.println("Wrong guess");
                case 5 -> System.out.println("Perhaps...");
                default -> System.out.println("Undefined value");
            }
        } catch(InputMismatchException exc) {
            System.out.println("Not an integer");
        }
    }
}
