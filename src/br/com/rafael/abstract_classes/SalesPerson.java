package br.com.rafael.abstract_classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SalesPerson extends Employee {
    public SalesPerson(String name, LocalDate dateOfBirth, String area, BigDecimal baseSalary){
        super(name, dateOfBirth, area, baseSalary);
    }

    public BigDecimal getSalary(BigDecimal sales, BigDecimal commissionPerSale){
        return this.baseSalary.add(commissionPerSale.multiply(sales));
    }

    public String getInfo(){ return "This is a salesperson"; }
}
