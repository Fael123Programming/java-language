package br.com.rafael.abstract_classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Manager extends Employee {
    //When you inherit a class, never forget to write again a constructor that includes in its
    //signature a constructor of the super class.

    public Manager(String name, LocalDate dateOfBirth, String area, BigDecimal baseSalary) {
        super(name, dateOfBirth, area, baseSalary);
    }

    public BigDecimal getSalary(BigDecimal extraWorkedHours, BigDecimal extraHourPrice) {
        return this.baseSalary.add(extraWorkedHours.multiply(extraHourPrice));
    }

    @Override
    public String getInfo(){ return "This is a manager"; }
}
