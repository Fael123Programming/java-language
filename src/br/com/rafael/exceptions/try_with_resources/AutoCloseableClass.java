package br.com.rafael.exceptions.try_with_resources;

public class AutoCloseableClass implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("AutoCloseableClass object was closed");
    }
}
