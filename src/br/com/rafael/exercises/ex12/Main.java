package br.com.rafael.exercises.ex12;

public class Main {
    public static void main(String[] args) {
        byte number = 10;
        System.out.println(factorial(number));
    }

    private static long factorial(byte number) {
        return number < 0 ? -1 : number <= 1 ? 1 : number * factorial((byte) (number - 1));
    }
}
