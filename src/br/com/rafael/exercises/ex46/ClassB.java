package br.com.rafael.exercises.ex46;

public class ClassB extends ClassA {
    /*public static void methodOne(int i) {
    }*/

    @Override
    public void methodTwo(int i) {
        System.out.println("Instance method in classB");
    }
    /*
    public void methodThree(int i) {
    }*/

    public static void methodFour(int i) { //Hiding a method from superclass
        System.out.println("Static method in classB");
    }
}
