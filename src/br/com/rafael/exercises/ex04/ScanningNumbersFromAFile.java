package br.com.rafael.exercises.ex04;

import java.util.Scanner;
import java.io.*;

public class ScanningNumbersFromAFile {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(new File("src/br/com/rafael/exercises/ex04/numbers.txt"))) {
            if (input.hasNextInt())
                System.out.println(input.nextInt());
            if (input.hasNextDouble())
                System.out.println(input.nextDouble());
            if (input.hasNextInt())
                System.out.println(input.nextInt());
        } catch(FileNotFoundException fnfe) {
            System.out.println("Cannot found the specified file");
        }
    }
}
