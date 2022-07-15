package br.com.rafael.exercises.ex48;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Character> chars = new ArrayList<>();
        int index = 0;
        System.out.print("Entre com os caracteres: ");
        String inputStr = input.next();
        for (char c : inputStr.toCharArray()) {
            if (Character.isLetter(c)) {
                chars.add(index++, c);
            } else if (Character.isDigit(c)) {
                chars.add(index, c);
            } else {
                System.out.println("Caractere nao reconhecido -> '" + c + "'");
                System.exit(0);
            }
        }
        int inputStrLen = inputStr.length();
        for (int i = 0; i < inputStrLen; i++) {
            System.out.print(inputStr.charAt(i));
            if (i < inputStrLen - 1) {
                System.out.print(" ");
            }
        }
        System.out.print(" -> ");
        for (int i = 0; i < inputStrLen; i++) {
            System.out.print(chars.get(i));
            if (i < inputStrLen - 1) {
                System.out.print(" ");
            }
        }
    }
}
