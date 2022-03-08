package br.com.rafael.exercises.ex23;

public class Main {
    public static void main(String[] args) {
        byte number = ~0; //~ is the unary bitwise complement operator.
        System.out.println(number);
        int result = 1 + 2;
        print(result);
        result--;
        print(result);
        result *= 2;
        print(result);
        result /= 2;
        print(result);
        result += 8;
        result %= 7;
        print(result);
    }

    private static void print(int number) {
        System.out.println(number);
    }
}
