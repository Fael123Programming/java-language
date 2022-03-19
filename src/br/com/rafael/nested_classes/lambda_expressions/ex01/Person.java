package br.com.rafael.nested_classes.lambda_expressions.ex01;

import java.time.LocalDate;

public class Person {
    private final String firstName, lastName, email;
    private final Gender gender;
    private final LocalDate dateOfBirth;

    public Person(String firstName, String lastName, String email, Gender gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public enum Gender {
        MAN, WOMAN
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        if (this.dateOfBirth == null)
            return -1;
        int age = LocalDate.now().getYear() - this.dateOfBirth.getYear();
        if (LocalDate.now().isBefore(LocalDate.of(LocalDate.now().getYear(),
                this.dateOfBirth.getMonth(), this.dateOfBirth.getDayOfMonth())))
            return --age;
        return age;
    }

    @Override
    public String toString() {
        return String.format("name=%s, age=%d", firstName + " " + lastName, getAge());
    }
}
