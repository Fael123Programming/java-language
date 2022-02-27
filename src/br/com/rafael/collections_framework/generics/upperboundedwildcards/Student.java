package br.com.rafael.collections_framework.generics.upperboundedwildcards;

public class Student extends Person {
    private String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    @Override
    public String toString() {
        return this.name + ", student of " + this.course;
    }
}
