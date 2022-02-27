package br.com.rafael.exercises.ex19;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = a;
        a = 20;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        IntegerType n1 = new IntegerType(100);
        IntegerType n2 = new IntegerType(200);
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        n2 = n1;
        n2.setNumber(1000);
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        Number n3 = 900;
        System.out.println(n3);
    }
}
