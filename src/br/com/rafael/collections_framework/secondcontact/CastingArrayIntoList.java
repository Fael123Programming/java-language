package br.com.rafael.collections_framework.secondcontact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastingArrayIntoList {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        for (int i = 0; i < 5; i++) {
            integers[i] = i + 1;
        }
        System.out.println(Arrays.toString(integers));
        List<Integer> listOfIntegers = Arrays.asList(integers); //Wrong way of doing that!!
        System.out.println(listOfIntegers);
        //Doing this way, both the array and the list will be linked to each other in memory.
        //If you change the value kept at any position, it will reflect on both.
        //Therefore, listOfIntegers can neither add nor delete a value.
        //It would throw an UnsupportedOperationException().
        List<Integer> numbers = new ArrayList<>(Arrays.asList(integers)); //Right way of doing that!!!
        numbers.add(0);
        numbers.set(0, 100);
        System.out.println(numbers);
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(integers));
        numbers2.add(0, 111);
        System.out.println(numbers2);
    }
}
