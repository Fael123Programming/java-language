package br.com.rafael.exceptions.hurling;

public class Test {
    public static void main(String[] args) {
        //If you divide two float point numbers, there will result an infinity number.
        //If you divide two integer numbers, there will be thrown an exception.
        try {
            divide(90, 0);
        } catch(IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }

    private static double divide(int n1, int n2) /*No 'throws' statement required*/ {
        if (n2 == 0)
            throw new IllegalArgumentException("Divider cannot be zero");
        //Methods that throw checked exceptions must have at their signatures
        //a 'throws' statement. Here's an example:
        //public void doSomething() throws ACheckedException {...}
        return n1 / ((double) n2);
    }
}
