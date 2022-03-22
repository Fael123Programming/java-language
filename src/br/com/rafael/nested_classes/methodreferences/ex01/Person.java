package br.com.rafael.nested_classes.methodreferences.ex01;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        if (this.birthday == null)
            return -1;
        int age = LocalDate.now().getYear() - this.birthday.getYear();
        if (LocalDate.now().isBefore(LocalDate.of(LocalDate.now().getYear(),
                this.birthday.getMonth(), this.birthday.getDayOfMonth())))
            return --age;
        return age;
    }

    public static int compareByAge(Person p1, Person p2) {
        return p1.birthday.compareTo(p2.birthday);
    }

    public static int compareByName(Person a, Person b) {
        return a.name.compareTo(b.name);
    }

    @Override
    public String toString() {
        return name + " - " + getAge() + " years old";
    }
}
