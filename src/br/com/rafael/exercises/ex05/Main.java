package br.com.rafael.exercises.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age < 16)
            System.out.println("Cannot vote");
        else if (age <= 17 || age > 65)
            System.out.println("Vote is facultative");
        else
            System.out.println("You shall vote");
    }
}
