package br.com.rafael.exercises.ex10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n"); //'\n' can be achieved hitting an enter button.
        int quantityOfStudents = 0;
        System.out.println("Grade System");
        System.out.print("How many students? ");
        try {
            quantityOfStudents = input.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Invalid quantity of students");
            System.out.println("Please, run this program once again");
            System.out.println("and type a positive integer");
        }
        if (quantityOfStudents < 0) {
            System.out.println("Invalid quantity of students");
            System.out.println("Please, run this program once again");
            System.out.println("and type a positive integer");
        } else if (quantityOfStudents == 0)
            System.out.println("No students to record");
        else {
            String[] students = new String[quantityOfStudents];
            float[] grades = new float[quantityOfStudents];
            int counter = 0;
            while (counter < quantityOfStudents) {
                System.out.println("--------------------------------------------");
                System.out.println("Student " + (counter + 1));
                System.out.print("Type their name: ");
                students[counter] = input.next();
                if (students[counter].isBlank()) {
                    System.out.println("Invalid name");
                    continue;
                }
                System.out.print("Type their grade: ");
                try {
                    grades[counter] = input.nextFloat();
                    if (grades[counter] < 0) {
                        System.out.println("Invalid grade");
                        continue;
                    }
                } catch (InputMismatchException exception) {
                    System.out.println("Invalid grade");
                    input.next(); //Clean the scanner's last caught item!
                    continue;
                }
                counter++;
            }
            int sizeLargestName = students[0].length();
            for (int i = 1; i < quantityOfStudents; i++)
                if (students[i].length() > sizeLargestName)
                    sizeLargestName = students[i].length();
            String header = String.format("%-" + (sizeLargestName + 2) + "s Grade", "Student");
            StringBuilder dashes = new StringBuilder();
            dashes.append("-".repeat(Math.max(0, header.length() + 5)));
            System.out.println(dashes);
            System.out.println(header);
            for (int i = 0; i < quantityOfStudents; i++)
                System.out.printf("%-" + (sizeLargestName + 2) + "s %.2f\n", students[i], grades[i]);
            System.out.println(dashes);
        }
    }
}
