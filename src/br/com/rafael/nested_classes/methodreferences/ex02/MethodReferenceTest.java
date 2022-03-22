package br.com.rafael.nested_classes.methodreferences.ex02;

import java.util.function.BiFunction;

public class MethodReferenceTest {
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
//        BiFunction is one of many functional interfaces in the java.util.function package. The BiFunction functional
//        interface can represent a lambda expression or method reference that accepts two arguments and produces a
//        result.
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b) {
        return a + b;
    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodReferenceTest test = new MethodReferenceTest();
        System.out.println(MethodReferenceTest.mergeThings("String 1 ", "String 2", (a, b) -> a + b));
        System.out.println(MethodReferenceTest.mergeThings("Hello ", "world!", MethodReferenceTest::appendStrings));
        System.out.println(MethodReferenceTest.mergeThings("Hey ", "guys!", test::appendStrings2));
        System.out.println(MethodReferenceTest.mergeThings("Now let ", "it be", String::concat));
    }
}
