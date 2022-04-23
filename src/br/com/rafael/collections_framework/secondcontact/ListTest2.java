package br.com.rafael.collections_framework.secondcontact;

import br.com.rafael.collections_framework.firstcontact.equalsandhashcode.Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparable and Comparator are interfaces used to sort collections.

public class ListTest2 {
    public static void main(String[] args) {
        Phone p1 = new Phone("Iphone X", "123456");
        Phone p2 = new Phone("Samsung Galaxy S20", "654321");
        Phone p3 = new Phone("Samsung A90", "198021");
        List<Phone> phones = List.of(p1, p2, p3);
        phones.forEach(System.out::println);
        System.out.println("Size: " + phones.size());
        System.out.println("Is it empty? " + phones.isEmpty());
        Phone other = new Phone("Samsung A90", "198021");
        System.out.println(phones.contains(other)); //method equals() is utilized!
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop Lenovo", 2000, 300));
        products.add(new Product("Laptop Asus", 5000, 50));
        products.add(new Product("Iphone X", 3000, 457));
        products.add(new Product("Keyboard Razer", 300, 89));
        products.forEach(System.out::println);
        System.out.println();
        Collections.sort(products); //Using the natural ordering of the class.
//      If the type of objects you want to sort does not implement Comparable interface
//      there will be a compile-time error.
//      The comparable interface says how a group of objects from a class
//      should be sorted if applied in a sorting algorithm.
        System.out.println("Sorted by name");
        products.forEach(System.out::println);
        System.out.println();
        products.sort(Comparator.comparingLong(Product::getId));
        System.out.println("Sorted by id");
        products.forEach(System.out::println);
        System.out.println();
        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Sorted by price");
        products.forEach(System.out::println);
    }
}
