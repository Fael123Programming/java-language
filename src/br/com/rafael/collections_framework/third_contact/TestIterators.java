package br.com.rafael.collections_framework.third_contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterators {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product 1", 90));
        productList.add(new Product("Product 2", 0));
        productList.add(new Product("Product 3", 40));
        productList.add(new Product("Product 4", 60));
        productList.add(new Product("Product 5", 0));
        System.out.println(productList);
        removeSoldOutProductsMethod2(productList);
        System.out.println(productList);

    }

    private static void removeSoldOutProductsMethod1(List<Product> productList) {
        Iterator<Product> it = productList.iterator();
        while (it.hasNext()) {
            if (it.next().getQuantity() == 0) {
                it.remove();
            }
        }
    }

    private static void removeSoldOutProductsMethod2(List<Product> productList) {
        productList.removeIf(product -> product.getQuantity() == 0);
    }
}