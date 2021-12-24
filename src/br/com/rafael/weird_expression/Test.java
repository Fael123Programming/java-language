package br.com.rafael.weird_expression;

public class Test {
    public static void main(String[] args) {
        int i = 10, j = 2, k = 3;
        j *= i += ++k; //We can combine operators seamlessly.
        System.out.println("i=" + i); //i = 14
        System.out.println("j=" + j); //j = 28
        System.out.println("k=" + k); //k = 4
        i /= k *= --j + ++k;
//      First, k = 5. After, j = 27.
//      Thereafter, k = 128. After, i = 0.
        System.out.println("-----------------");
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k); //Amazingly, k is set to 128 instead of 160.
    }
}
