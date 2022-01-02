package br.com.rafael.exercises.ex08;

import java.util.Scanner;

public class TestingLinuxTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Your name: ");
        name = input.nextLine();
        System.out.println("Welcome " + name + "!");
    }
}
