package br.com.rafael.exercises.ex47;

public class Main {
    public static void main(String... args) {
        Phone p1 = new Phone(null);
        Phone p2 = new Phone(null);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
    }
}
