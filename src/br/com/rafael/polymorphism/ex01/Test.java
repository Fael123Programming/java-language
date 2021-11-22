package br.com.rafael.polymorphism.ex01;

public class Test {
    public static void main(String[] args) {
        SuperClass anObject = new ChildClass();
        anObject.doNothing();
    }
}
