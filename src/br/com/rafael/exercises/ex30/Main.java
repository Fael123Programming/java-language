package br.com.rafael.exercises.ex30;

public class Main {
    public static void main(String[] args) {
        System.out.println("Passing of arguments into methods in Java is always done by value even with a reference");
        System.out.println("variable: you cannot reassign a variable and make that it becomes permanent");
        int number = 300;
        System.out.println("number=" + number);
        testArgumentPassingWithPrimitiveVariable(number);
        System.out.println("number=" + number);
        Person person = new Person("Mike");
        System.out.println("name=" + person.getName());
        testArgumentPassingWithReferenceVariable(person);
        System.out.println("name=" + person.getName());
    }

    private static void testArgumentPassingWithPrimitiveVariable(int value) {
        value -= 100;
    }

    private static void testArgumentPassingWithReferenceVariable(Person person) {
        person.setName("Ibrahim"); //Change takes effect!
        person = new Person("James Gosling"); //Change does not take effect!
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
