package br.com.rafael.nested_classes.lambda_expressions.ex01;

import java.time.LocalDate;

import br.com.rafael.nested_classes.lambda_expressions.ListPrinter;
import br.com.rafael.nested_classes.lambda_expressions.ex01.Person.Gender;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Marcos", "Silva", "marcos.silva@gmail.com", Gender.MAN, LocalDate.of(1990, 7, 20));
        Person p2 = new Person("Maria", "Neves", "maria.neves@gmail.com", Gender.WOMAN, LocalDate.of(1970, 2, 15));
        Person p3 = new Person("Antonio", "Pedrosa", "antonio.pedrosa@google.com", Gender.MAN, LocalDate.of(1990, 12, 2));
        Person p4 = new Person("Jessica", "Santos", "jessica.santos@gmail.com", Gender.WOMAN, LocalDate.of(1965, 5, 12));
        Person p5 = new Person("Marilia", "Andressa", "marilia.andressa@yahoo.com", Gender.WOMAN, LocalDate.of(2000, 1, 30));
        Group g = new Group(p1, p2, p3, p4, p5);
        ListPrinter<Person> printer = new ListPrinter<>();
        printer.print(g.listPeopleOlderThan(40));
        System.out.println("----------------------------------------------------------");
        printer.print(g.listPeopleWithinAnAgeRange(30, 40));
        class GoogleGmailSearcher implements Criteria { //Local class.
            @Override
            public boolean check(Person p) {
                return p.getEmail().contains("google");
            }
        }
        System.out.println("----------------------------------------------------------");
        printer.print(g.listPeople(new GoogleGmailSearcher()));
        System.out.println("----------------------------------------------------------");
        printer.print(g.listPeople(new Criteria() { //Anonymous class.
            @Override
            public boolean check(Person p) {
                return p.getGender() == Gender.WOMAN;
            }
        }));
        System.out.println("----------------------------------------------------------");
        printer.print(g.listPeople((Person p) -> p.getEmail().contains("yahoo")));
        System.out.println("----------------------------------------------------------");
        printer.print(g.listPeople((Person p) -> p.getFirstName().equals("Jessica")));
    }
}
