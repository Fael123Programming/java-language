package br.com.rafael.collections_framework.secondcontact;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private final long id;
    private String name;
    private double price;

    public Product(String name, double price, long id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Product castedProduct))
            return false;
        if (this == castedProduct)
            return true;
        return id == castedProduct.id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product p) { //Natural ordering method of the class.
//       this > p ? return a positive value!
//       this == p ? return zero!
//       this < p ? return a negative value!
        return name.compareTo(p.name); //Strings already have a compareTo() method!
    }

    public static class ProductIdComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return Long.compare(p1.getId(), p2.getId());
        }
    }

    public static class ProductPriceComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
            //Multiply by -1 to get it reversed.
        }
    }
}