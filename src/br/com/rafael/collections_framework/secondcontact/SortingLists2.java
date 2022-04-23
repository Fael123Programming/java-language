package br.com.rafael.collections_framework.secondcontact;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortingLists2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("P5", 450, 100));
        products.add(new Product("P13", 234, 789));
        products.add(new Product("P6", 1500, 9));
        products.add(new Product("P44", 100, 57));
        products.add(new Product("P23", 389, 33));
        products.forEach(e -> System.out.print(e + " "));
        System.out.println();
        Collections.sort(products);
        System.out.println("----- Sorted by product name");
        products.forEach(e -> System.out.print(e + " "));
        System.out.println();
        products.sort(new Product.ProductIdComparator());
        System.out.println("----- Sorted by id");
        products.forEach(e -> System.out.print(e + " "));
        System.out.println();
        Collections.sort(products, new Product.ProductPriceComparator());
        System.out.println("----- Sorted by price");
        products.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
