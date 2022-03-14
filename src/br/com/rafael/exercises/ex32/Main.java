package br.com.rafael.exercises.ex32;

public class Main {
    public static void main(String[] args) {
        DataKeeper a = new DataKeeper(), b = new DataKeeper();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println(a.y);
        System.out.println(b.y);
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(DataKeeper.x);
    }
}
