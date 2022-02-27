package br.com.rafael.collections_framework.generics.upperboundedwildcards;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Stuart"));
        people.add(new Person("Spyder-man"));
        people.add(new Person("Batman"));
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marcelo", "Computing Science"));
        students.add(new Student("Mary", "Accountability"));
        students.add(new Student("John", "Economy"));
        printList(people);
        printList(students);
        List<Double> coefficients = new ArrayList<>();
        coefficients.add(3.45);
        coefficients.add(1.78);
        coefficients.add(902.1132312);
//        printList(coefficients); -> Not allowed due upperbound wildcard definition limitation for this method
    }

    public static void printList(List<? extends Person> people) {
        for (Person p : people)
            System.out.println(p);
    }
}
