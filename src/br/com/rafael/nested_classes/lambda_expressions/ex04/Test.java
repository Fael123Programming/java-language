package br.com.rafael.nested_classes.lambda_expressions.ex04;

import br.com.rafael.nested_classes.lambda_expressions.ex01.Group;
import br.com.rafael.nested_classes.lambda_expressions.ex01.Person;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Marcos", "Silva", "marcos.silva@gmail.com", Person.Gender.MAN, LocalDate.of(1990, 7, 20));
        Person p2 = new Person("Maria", "Neves", "maria.neves@gmail.com", Person.Gender.WOMAN, LocalDate.of(1970, 2, 15));
        Person p3 = new Person("Antonio", "Pedrosa", "antonio.pedrosa@google.com", Person.Gender.MAN, LocalDate.of(1990, 12, 2));
        Person p4 = new Person("Jessica", "Santos", "jessica.santos@gmail.com", Person.Gender.WOMAN, LocalDate.of(1965, 5, 12));
        Person p5 = new Person("Marilia", "Andressa", "marilia.andressa@yahoo.com", Person.Gender.WOMAN, LocalDate.of(2000, 1, 30));
        Group g = new Group(p1, p2, p3, p4, p5);
        g.processPeople((Person p) -> p.getFirstName().contains("Ma"), (email) -> System.out.println(email), (Person p) -> p.getEmail());
//      The predicate evaluates who is going to be reached.
//      The consumer states what kind of action to perform with the return of the function.
//      The function receives a type of data and returns another one.

    }
}
