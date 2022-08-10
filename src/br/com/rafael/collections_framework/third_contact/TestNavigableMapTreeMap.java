package br.com.rafael.collections_framework.third_contact;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TestNavigableMapTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> students = new TreeMap<>();
        //Esse tipo de map tem seus elementos ordenados pelas chaves.
        //Desta forma, estas precisam implementar comparable.
        students.put(89112, "Lucas Ferdinand");
        students.put(11100, "Marcus Brighton");
        students.put(89111, "Angela Gloriana");
        students.put(77812, "Ana Cristine");
        students.put(81144, "Linus Torvalds");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println(students.headMap(81144));
    }
}
