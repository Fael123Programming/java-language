package br.com.rafael.collections_framework.generics.lowerboundedwildcards;

import br.com.rafael.collections_framework.generics.upperboundedwildcards.Person;
import br.com.rafael.collections_framework.generics.upperboundedwildcards.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Stuart"));
        people.add(new Person("Spyder-man"));
        people.add(new Person("Batman"));
        List<LivingBeing> beings = new ArrayList<>();
        beings.add(new LivingBeing("Monkey"));
        beings.add(new Person("Macon Jackson"));
        beings.add(new Student("Lucas", "Software Engineering"));
        printList(people);
        printList(beings);
    }

    public static void printList(List<? super Person> people) {
        for (Object p : people)
            System.out.println(p);
    }
}
