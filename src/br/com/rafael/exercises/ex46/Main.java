package br.com.rafael.exercises.ex46;

public class Main {
    public static void main(String... args) {
        ClassA classA = new ClassA();
        classA.methodTwo(1);
        ClassA.methodFour(1);
        ClassB classB = new ClassB();
        classB.methodTwo(2);
        ClassB.methodFour(2);
    }
}
