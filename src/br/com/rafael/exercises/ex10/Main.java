package br.com.rafael.exercises.ex10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.exit(-1);
        Scanner input = new Scanner(System.in);
        int quantityOfStudents = 0;
        System.out.println("Grade System");
        System.out.println("----------------------");
        System.out.print("How many students? ");
        try {
            quantityOfStudents = input.nextInt();
            if (quantityOfStudents < 0)
                System.out.println("Invalid quantity of students");
            else if (quantityOfStudents == 0)
                System.out.println("Program finalized");
            else {
                String[] students = new String[quantityOfStudents];
                float[] grades = new float[quantityOfStudents];
                int counter = 0;
                while (counter < quantityOfStudents) {
                    System.out.println("----------------------");
                    System.out.println("Student " + (counter + 1));
                    System.out.print("Type their name: ");
                    students[counter] = input.next();
                    System.out.print("Type their grade: ");
                    try {
                        grades[counter] = input.nextFloat();
                        counter++;
                    } catch (InputMismatchException ignored) {}
                }
                System.out.println("----------------------");
                System.out.printf("%-15s Grade\n", "Student");

            }
        } catch (InputMismatchException exc) {
            System.out.println("Invalid quantity of students");
            System.exit(-1);
        }
    }
}
