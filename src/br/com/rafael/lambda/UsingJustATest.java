package br.com.rafael.lambda;

public class UsingJustATest {
    public static void main(String[] args) {
        System.out.println("If you want to pass a method into another method");
        System.out.println("use lambda expressions or method reference");
        JustATest jat = (message, integer, floatNumber, logic) -> {
            //Functional interfaces can be "instantiated" using lambda expressions!
            System.out.println("Values provided:");
            System.out.println("String: " + message);
            System.out.println("Integer: " + integer);
            System.out.println("Float Number: " + floatNumber);
            System.out.println("Logic: " + logic);
        };
        jat.method1("Java 17", 2021, Math.PI, true);
    }
}
