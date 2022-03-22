package br.com.rafael.nested_classes.methodreferences.ex01;

import br.com.rafael.nested_classes.methodreferences.ex03.TransferenceDoer;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Marinna Jones", LocalDate.of(2000, 8, 4));
        people[1] = new Person("Michael Silva", LocalDate.of(1999, 10, 10));
        people[2] = new Person("Lucas Pereira", LocalDate.of(2006, 11, 1));
        people[3] = new Person("Andre Narc", LocalDate.of(1980, 7, 9));
        people[4] = new Person("Pirjo Perez", LocalDate.of(1960, 11, 13));
        System.out.println("Before sorting by age");
        for (Person p : people)
            System.out.println(p);
        System.out.println("--------------------------------");
        Arrays.sort(people, Person::compareByAge);
//      Lambda expression using a method reference.
//      This lambda expressions is a short for creating a class that implements Comparable, instantiating it
//      instantly. The implementation for the method compareTo() will behave likewise the method compareByAge()
//      of class Person.
        System.out.println("After sorting by age");
        for (Person p : people)
            System.out.println(p);
//      There are four kinds of methods references:
//        -> Reference to a static method (ContainingClass::staticMethodName);
//        -> Reference to an instance method of a particular object (containingObject::instanceMethodName);
//        -> Reference to an instance method of an arbitrary object of a particular type (ContainingType::methodName);
//        -> Reference to a constructor (ClassName::new).
        System.out.println("--------------------------------");
        Arrays.sort(people, Person::compareByName);
        System.out.println("After sorting by name");
        for (Person p : people)
            System.out.println(p);
        System.out.println("--------------------------------");
        List<Person> roster = List.of(people);
        Set<Person> setOfPeople1 = TransferenceDoer.transferElements(roster, () -> new HashSet<>());
        Set<Person> setOfPeople2 = TransferenceDoer.transferElements(roster, HashSet::new);
        Set<Person> setOfPeople3 = TransferenceDoer.transferElements(roster, HashSet<Person>::new);
    }
}
