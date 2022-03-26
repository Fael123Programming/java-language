package br.com.rafael.collections_framework.firstcontact.equalsandhashcode;


public class EqualsTest {
    public static void main(String[] args) {
        String str1 = "str1", str2 = "str1";
//      Both str1 and str2 point to the very same object in the pool of Strings.
        System.out.println(str1 == str2); //True! Their memory references are the same.
        String name1 = "Michael"; //Stored in the pool of Strings.
        String name2 = new String("Michael"); //Stored in the JVM heap.
        System.out.println(name1 == name2); //False! Each one is located in a different place.
//    The same applies to the other wrapper classes such as Integer, Double and so on.
        System.out.println(name1.equals(name2));
        System.out.println("-------------------------------------------");
        Phone p1 = new Phone("Samsung A70", "XYIJK90123");
        Phone p2 = new Phone("Iphone X", "ASDAS90123");
        System.out.println(p1.equals(p2) + " " + p2.equals(p1));
        System.out.println(p1.equals(null));
        System.out.println(p1.equals(100));
        Phone p3 = p1;
        Phone p4 = new Phone("Samsung A70", "XYIJK90123");
        System.out.println(p3.equals(p1));
        System.out.println(p1.equals(p4));
    }
}
