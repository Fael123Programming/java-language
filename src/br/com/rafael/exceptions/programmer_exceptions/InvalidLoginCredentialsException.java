package br.com.rafael.exceptions.programmer_exceptions;

public class InvalidLoginCredentialsException extends Exception {
    public InvalidLoginCredentialsException() {
        super("Invalid credentials");
    }

    public InvalidLoginCredentialsException(String message) {
        super(message);
    }
}
