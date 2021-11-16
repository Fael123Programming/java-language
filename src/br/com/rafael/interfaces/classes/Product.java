package br.com.rafael.interfaces.classes;

//Interface is a type of software element that says what an object
//does but not how it does (the implementation).
//All methods are public and abstract by definition but there can be default methods,
//that is, methods with a unique and unmodifiable implementation (one behaviour at all).
//Also, it can have attributes, but they have to be public, static and final.

import br.com.rafael.interfaces.interfaces_themselves.*;
import java.math.BigDecimal;

public class Product implements Taxable, Transportable {
    private String name;
    private String id;
    private BigDecimal rawPrice;
    private double weightKg;

    public Product(String name, String id, BigDecimal rawPrice, double weightKg) {
        this.name = name;
        this.id = id;
        this.rawPrice = rawPrice;
        this.weightKg = weightKg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getRawPrice() {
        return rawPrice;
    }

    public void setRawPrice(BigDecimal rawPrice) {
        this.rawPrice = rawPrice;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public void setWeightKg(double newWeight) {
        weightKg = newWeight;
    }

    @Override
    public BigDecimal calculateTaxesOverPrice() {
        return rawPrice.multiply(Taxable.FEDERAL_TAX).add(rawPrice.multiply(Taxable.STATE_TAX)).add(rawPrice.multiply(Taxable.CITY_TAX));
    }

    @Override
    public BigDecimal calculateTaxedPrice() {
        return rawPrice.multiply(BigDecimal.ONE.add(Taxable.FEDERAL_TAX).add(Taxable.STATE_TAX).add(CITY_TAX));
    }

    @Override
    public BigDecimal calculateTransport() {
        return rawPrice.multiply(BigDecimal.valueOf(weightKg).multiply(new BigDecimal("0.01")));
    }
}