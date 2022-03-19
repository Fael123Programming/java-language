package br.com.rafael.nested_classes.lambda_expressions.ex08;

import java.util.concurrent.Callable;

public class Test {
    class Invoker {
        void invoke(Runnable r) {
            r.run();
        }

        <T> T invoke(Callable<T> c) throws Exception {
            return c.call();
        }
    }

    public static void main(String[] args) throws Exception {
        Test t = new Test();
        Invoker i = t.new Invoker();
        String s = i.invoke(() -> "done"); //Implementing the method call() of Callable.
//      The type of return of the method invoke is defined by the value put in the lambda expression.
        System.out.println(s);
    }
}
