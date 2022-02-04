package br.com.rafael.interfaces.ex01.tests;

import br.com.rafael.interfaces.ex01.classes.Car;
import br.com.rafael.interfaces.ex01.classes.Product;
import br.com.rafael.interfaces.ex01.interfaces_themselves.*;

import java.math.BigDecimal;

public class Test1 {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook Samsung", "1232123/123-A", new BigDecimal("3000"), 1.5);
        System.out.println("Raw price: $" + p1.getRawPrice());
        taxableInfo(p1);
        transportableInfo(p1);
        //A product is both a Taxable and a Transportable object. Actually, it signs the contract to be referred to
        //as having these characteristics.
        //Every class which signs a contract (implements an interface) must be capable of doing the things that that
        //interface defines. In our case, it must know how to calculate taxes with a price and the cost to transport
        //a product.
        System.out.println("-------------------------------------------------------");
        Car c1 = new Car("Lamborghini","Aventador V12", "Black Panther", new BigDecimal("1000000"), 1500);
        System.out.println("Raw price: $" + c1.getRawPrice());
        taxableInfo(c1);
        transportableInfo(c1);
        System.out.println("-------------------------------------------------------");
        System.out.println(p1.getTaxes());
        System.out.println("-------------------------------------------------------");
        System.out.println(c1.getTaxes());
    }

    private static void taxableInfo(Taxable taxable) {
        System.out.println("Taxed price: $" + taxable.calculateTaxedPrice());
        System.out.println("Total tax: $" + taxable.calculateTaxesOverPrice());
    }

    private static void transportableInfo(Transportable transportable) {
        System.out.println("Transport cost: $" + transportable.calculateTransport());
    }
}
