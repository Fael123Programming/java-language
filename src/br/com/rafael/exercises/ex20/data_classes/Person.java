package br.com.rafael.exercises.ex20.data_classes;

import java.time.LocalDate;

public class Person {
    private String name;
    private Address address;
    private LocalDate dateOfBirth;

    public Person(String name, Address address, LocalDate dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public String toString() {
        return "{name: " + this.name + ", address: " + this.address + ", dateOfBirth: " + this.dateOfBirth.toString()
                + "}";
    }
}
