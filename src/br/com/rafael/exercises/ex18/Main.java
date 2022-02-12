package br.com.rafael.exercises.ex18;

import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Type the numbers: ");
        try {
            String numbersString = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(numbersString);
            short[] numbers = new short[tokenizer.countTokens()];
            short i = 0;
            while (tokenizer.hasMoreTokens())
                numbers[i++] = Short.parseShort(tokenizer.nextToken());
            i = (short) new Random().nextInt(numbers.length);
            System.out.print("You've typed: ");
            for (short j = 0; ; j++) {
                System.out.print(numbers[j]);
                if (j == numbers.length - 1)
                    break;
                System.out.print(", ");
            }
            System.out.println("\nChoose " + numbers[i]);
        } catch(IOException ignore) {
            System.out.println("An IOException has been thrown");
        }
    }
}
