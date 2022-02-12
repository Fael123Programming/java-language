package br.com.rafael.exercises.ex19;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = a;
        a = 20;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        Number n1 = new Number(100);
        Number n2 = new Number(200);
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        n2 = n1;
        n2.setNumber(1000);
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
    }
}
