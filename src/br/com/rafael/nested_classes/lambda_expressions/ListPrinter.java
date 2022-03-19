package br.com.rafael.nested_classes.lambda_expressions;

import java.util.List;

public class ListPrinter<T> {
    public void print(List<T> list) {
        for (T t : list)
            System.out.println(t);
    }
}
