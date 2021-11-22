package br.com.rafael.exceptions.try_with_resources;


import java.io.Closeable;

public class CloseableClass implements Closeable {
    @Override
    public void close() {
        System.out.println("CloseableClass object was closed");
    }
}
