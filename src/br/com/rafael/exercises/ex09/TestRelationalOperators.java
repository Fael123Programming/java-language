package br.com.rafael.exercises.ex09;

public class TestRelationalOperators {
    public static void main(String[] args) {
        int i1 = 10, i2 = 20;
        float f1 = 3.5f, f2 = 4.5f;
        char c1 = 'x', c2 = 'y';
        boolean b1 = true, b2 = false;
        String s1 = "Java", s2 = "Java";
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1 <= i2);
        System.out.println(i1 > i2);
        System.out.println(f1 == f2);
        System.out.println(f1 != f2);
        System.out.println(f1 >= f2);
        System.out.println(f1 < f2);
        System.out.println("Char comparisons");
        System.out.println(c1 == c2);
        System.out.println(c1 != c2);
        System.out.println(c1 <= c2);
        System.out.println(c1 > c2);
        System.out.println("-----------------");
        System.out.println(s1 == s2);
        System.out.println(s1 != s2);
//        System.out.println(s1 >= s2); Compilation time error!
//        System.out.println(s1 < s2);
        System.out.println(b1 == b2);
        System.out.println(b1 != b2);
//        System.out.println(b1 <= i1); Compilation time error!
//        System.out.println(b1 < b2);
        System.out.println(i2 > f2);
    }
}
