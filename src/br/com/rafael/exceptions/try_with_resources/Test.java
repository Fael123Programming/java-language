package br.com.rafael.exceptions.try_with_resources;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try(CloseableClass closeable1 = new CloseableClass();
            AutoCloseableClass closeable2 = new AutoCloseableClass()) {
            System.out.println("Inside try block.");
        }
    }

    private static void openFileJava6() {
        Reader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("Test.java"));
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ioe) {
                    System.out.println("Could not close fileReader");
                }
            }
        }
    }

    private static void openFileJava7() {
//        Using try-with-resources the object created within parentheses must implement
//        AutoCloseable or its children.
//        Java will have the responsibility of closing our resource.
//        You can create more resources separating them through semi-colons.
//        You are not obliged of adding a catch or finally statement.
        try (Reader fileReader = new BufferedReader(new FileReader("Test.java"))) {

        } catch (IOException ioe) {

        }
    }
}
