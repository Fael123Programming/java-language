package br.com.rafael.exercises.ex03;

import java.io.IOException;
import java.io.PrintStream;

public class TestingPrintStream {
    public static void main(String[] args) throws IOException {
        PrintStream printer = new PrintStream("runnable.py");
        printer.println("for c in range(10000):");
        printer.append("    print('Jesus is everything!!!')");
        printer.close();
//        If runnable.py does not exist it will be created!
    }
}
