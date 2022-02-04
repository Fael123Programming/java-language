package br.com.rafael.interfaces.ex01.classes;

import br.com.rafael.interfaces.ex01.interfaces_themselves.*;

import java.math.BigDecimal;

public class Car implements Taxable, Transportable {
    private String brand, model, color;
    private BigDecimal rawPrice;
    private double weightKg;

    public Car(String brand, String model, String color, BigDecimal rawPrice, double weightKg) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.rawPrice = rawPrice;
        this.weightKg = weightKg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getRawPrice() {
        return rawPrice;
    }

    public void setRawPrice(BigDecimal rawPrice) {
        this.rawPrice = rawPrice;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public BigDecimal calculateTaxesOverPrice(){
        return rawPrice.multiply(Taxable.FEDERAL_TAX).add(rawPrice.multiply(Taxable.STATE_TAX)).add(rawPrice.multiply(Taxable.CITY_TAX));
    }

    @Override
    public BigDecimal calculateTaxedPrice(){
        return rawPrice.multiply(BigDecimal.ONE.add(Taxable.FEDERAL_TAX).add(Taxable.STATE_TAX).add(CITY_TAX));
    }

    @Override
    public BigDecimal calculateTransport(){
        return rawPrice.multiply(BigDecimal.valueOf(weightKg).multiply(new BigDecimal("0.01")));
    }

    @Override
    public String getTaxes(){ //A default method can be overridden seamlessly...
        return "Bla bla bla";
    }
}
