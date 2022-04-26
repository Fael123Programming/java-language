package br.com.rafael.collections_framework.secondcontact;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CastingListIntoArray {
    public static void main(String[] args) {
        //This lesson goes around the List.toArray() method.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(789);
        numbers.add(89);
        numbers.add(7);
        Object[] numbersArray = numbers.toArray();
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbersArray));
        Integer[] integers = new Integer[numbers.size()];
        numbers.toArray(integers);
        System.out.println(Arrays.toString(integers));
    }
}
