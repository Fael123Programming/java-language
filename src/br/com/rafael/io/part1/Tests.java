package br.com.rafael.io.part1;

import java.io.*;

public class Tests {
    public static void main(String[] args) throws IOException {
        PrintStream screen = System.out;
        screen.println("System.out is an object from class PrintStream");
        InputStream inputStream = System.in;
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader buffer = new BufferedReader(reader);
        System.out.println(buffer.readLine());
    }
}
