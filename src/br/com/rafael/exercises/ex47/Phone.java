package br.com.rafael.exercises.ex47;

import java.util.Objects;

public class Phone {
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone() {}

    public String getBrand() {
        return brand;
    }


    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (!(anotherObject instanceof Phone anotherObjectCasted)) {
            return false;
        }
        return brand != null && brand.equals(anotherObjectCasted.brand);
    }
}
