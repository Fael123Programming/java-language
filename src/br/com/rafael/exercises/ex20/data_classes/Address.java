package br.com.rafael.exercises.ex20.data_classes;

public class Address {
    private String country, city, street;
    private short number;

    public Address(String country, String city, String street, short number) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public short getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "{country: " + this.country + ", city: " + this.city + ", street: " + this.street + ", number: " +
                this.number + "}";
    }
}

