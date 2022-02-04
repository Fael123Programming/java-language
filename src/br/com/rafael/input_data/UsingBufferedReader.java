package br.com.rafael.input_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UsingBufferedReader {
    public static void main(String[] args) {
        System.out.println(System.in.getClass().getName());
//      System.in is the standard input stream of the system.
//      It is of class BufferedInputStream
        System.out.println(System.out.getClass().getName());
//      System.out is the standard output stream of the system.
//      It is of class PrintStream
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Give me a string: ");
            String string = reader.readLine();
            System.out.println("You have typed " + string);
        } catch (IOException ignore) {
            System.out.println("An IOException has been thrown...");
        }
        System.out.print("Now, I would like to receive a few integers: ");
        String integers = "";
        try {
            integers = reader.readLine();
        } catch (IOException ignore) {
            System.out.println("An IOException has been thrown...");
        }
        StringTokenizer st = new StringTokenizer(integers);
        System.out.print("Integers: ");
        while (true) {
            try {
                System.out.print(Integer.parseInt(st.nextToken()));
            } catch(NumberFormatException ignore) {
                System.out.println("invalid input");
                break;
            }
            if (st.hasMoreTokens())
                System.out.print(" ");
            else
                break;
        }
    }
}
