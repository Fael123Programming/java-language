package br.com.rafael.collections_framework.secondcontact.lists;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//      Generics come from Java version 5.
        names.add("string 1");
        names.add("string 2");
        names.add("string 3");
//        names.add(900); -> Compiler error! Type does not match.

        for (String str : names) {
//            names.add("string 3"); -> ConcurrentModificationException!!!
//            When iterating over a collection with a for-each
//            you cannot modify the corresponding collection.
            System.out.println(str);
        }
        System.out.println(names.remove("string 1"));
        System.out.println(names.remove(0) + " got removed too");
        names.forEach(System.out::println);
//        System.out.println(names.get(2)); -> IndexOutOfBoundsException!!!
        int[] a = {1, 2};
//        System.out.println(a[2]); -> ArrayIndexOutOfBoundsException!!!
//        List<int> numbers = new ArrayList<>(); -> Usage of primitive types with generics are not allowed!
//        When removing an element from a collection passing the desired data to be removed, Java uses
//        the method equals() to check whether it is the one wanted to be blot out.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100); //100 is boxed into an integer object.
        numbers.add(900);
        numbers.add(500);
        numbers.add(5);
        numbers.add(34);
        numbers.forEach(n -> System.out.println(n + " " + n.getClass().getName()));
        System.out.println(numbers.remove(Integer.valueOf(100))); //equals() will be used though.
        System.out.println("Size: " + numbers.size());

        List<Integer> ages = List.of(90, 10, 30);
        numbers.clear();
        numbers.addAll(ages); //Adds a whole new collection into another one.
        numbers.forEach(System.out::println);
    }
}
