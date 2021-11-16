package br.com.rafael.abstract_classes;

import java.math.BigDecimal;
import java.time.LocalDate;

//An abstract class is a class used only for inheritance purposes: it grabs some important data
//inside itself and cannot be instantiated but only construct reference variables for its children.

public abstract class Employee extends Person { //No objects of this class for you!!!
    private String area;
    protected BigDecimal baseSalary;

    public Employee(String name, LocalDate dateOfBirth, String area, BigDecimal baseSalary) {
        super(name, dateOfBirth);
        this.area = area;
        this.baseSalary = baseSalary;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void getStandardized(){
        System.out.println("Only a test method...");
    }

    public abstract BigDecimal getSalary(BigDecimal bg1, BigDecimal bg2);
    //To calculate a salary we need two parameters but what they are depends on the concrete class we are using.

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.name + '\'' +
                ", area='" + area + '\'' +
                ", dateOfBirth=" + super.dateOfBirth +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
