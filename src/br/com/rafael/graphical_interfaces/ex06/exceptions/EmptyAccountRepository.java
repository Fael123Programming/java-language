package br.com.rafael.graphical_interfaces.ex06.exceptions;

public class EmptyAccountRepository extends RuntimeException {
    public EmptyAccountRepository() {
        super("Empty account repository");
    }
}
