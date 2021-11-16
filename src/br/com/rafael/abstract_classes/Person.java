package br.com.rafael.abstract_classes;

import java.time.LocalDate;

public abstract class Person {
    protected final String name;
    protected final LocalDate dateOfBirth;

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public abstract void getStandardized();

    public final int getAge() { //This method cannot be overridden by children of this class.
        if (dateOfBirth == null) return -1;
        int age = LocalDate.now().getYear() - this.dateOfBirth.getYear();
        return LocalDate.now().isBefore(LocalDate.of(LocalDate.now().getYear(), this.dateOfBirth.getMonth(), this.dateOfBirth.getDayOfMonth())) ? --age : age;
        //If this condition above is true, it means that the person did not turn to their new annual age.
    }

    public String getName(){
        return name;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
}
