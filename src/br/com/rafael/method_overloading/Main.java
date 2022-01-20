package br.com.rafael.method_overloading;

public class Main {
    public void print(String msg) {
        System.out.println(msg);
    }

    protected String print(String msg, int num) {
        //Method overloading: you can change the access modifier and the return value. You must change the parameters!
        //Method name cannot be changed.
        String printable = msg + num;
        System.out.println(printable);
        return printable;
    }
}
