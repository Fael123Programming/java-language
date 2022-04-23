package br.com.rafael.collections_framework.secondcontact;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Microwave", 1500, 1);
        products[1] = new Product("Refrigerator", 3000, 4);
        products[2] = new Product("Television", 2000, 3);
        products[3] = new Product("Fan", 20, 2);
        products[4] = new Product("Laptop", 1000, 5);
        System.out.println(Arrays.toString(products));
        System.out.println("----- Sorted by name");
        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
        System.out.println("----- Sorted by price");
        Arrays.sort(products, new Product.ProductPriceComparator());
        System.out.println(Arrays.toString(products));
        System.out.println("----- Sorted by id");
        Arrays.sort(products, new Product.ProductIdComparator());
        System.out.println(Arrays.toString(products));
    }
}
