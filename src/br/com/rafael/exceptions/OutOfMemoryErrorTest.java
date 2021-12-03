package br.com.rafael.exceptions;

public class OutOfMemoryErrorTest {
    public static void main(String[] args) {
        String[] largeArray = new String[Integer.MAX_VALUE];
    }
}
