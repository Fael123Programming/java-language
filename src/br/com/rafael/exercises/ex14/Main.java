package br.com.rafael.exercises.ex14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder numbers = new StringBuilder();
        byte i = 0;
        int number, greatest = 0;
        do {
            System.out.print("Number " + (i + 1) + ": ");
            number = input.nextInt();
            if (i < 4)
                numbers.append(number).append(" - ");
            else
                numbers.append(number);
            if (i == 0)
                greatest = number;
            else if (number > greatest)
                greatest = number;
            i++;
        } while (i < 5);
        System.out.println("Numbers typed: " + numbers);
        System.out.println("Greatest: " + greatest);
    }
}
