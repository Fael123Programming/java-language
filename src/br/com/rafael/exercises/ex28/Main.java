package br.com.rafael.exercises.ex28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aNumber = input.nextInt();
        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("First string");
        else
            System.out.println("Second string");
        System.out.println("Third string");
    }
}
