package br.com.rafael.collections_framework.equalsandhashcode;

public class HashCodeTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("Whatever", "12345");
        System.out.println(p1.hashCode());
        System.out.println("12345".hashCode());
    }
}
