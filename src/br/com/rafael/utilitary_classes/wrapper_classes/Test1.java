package br.com.rafael.utilitary_classes.wrapper_classes;

public class Test1 {
    public static void main(String[] args) {
//        There are 8 primitive types in Java:
//      Integer Family
//        byte----> a byte (8 bits) from -(2 ^ 7) (-128) to 2 ^ 7 - 1 (127) totalizing 2 ^ 8 = 256 numbers.
//        short---> 2 bytes (16 bits) from -(2 ^ 15) (-32,768) to 2 ^ 15 - 1 (32,767) totalizing 2 ^ 16 = 65,536 numbers.
//        int-----> 4 bytes (32 bits) from -(2 ^ 31) (-2,147,483,648) to 2 ^ 31 - 1 (2,147,483,647) totalizing 2 ^ 32 = 4,294,967,296 numbers.
//        long----> 8 bytes (64 bites) from -(2 ^ 63) (-9,223,372,036,854,775,808) to 2 ^ 63 - 1 (9,223,372,036,854,775,807) totalizing 2 ^ 64 = 18,446,744,073,709,551,616 numbers.
//      Floating-Point Family
//        float---> 4 bytes (32 bits) with 6 or 7 precision on decimal points.
//        double--> 8 bytes (64 bits) with 15 precision on decimal points.
//      Logic
//        boolean-> a bit (true = whatever number different of zero, false = 0).
//      Text
//        char----> 2 bytes (16 bits) only a single character surrounded by simple quotes.
        System.out.println("Byte:  " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE + " hundreds");
        System.out.println("Short: " + Short.MIN_VALUE + " " + Short.MAX_VALUE + " thousands");
        System.out.println("Int:   " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE + " billions");
        System.out.println("Long:  " + Long.MIN_VALUE + " " + Long.MAX_VALUE + " quintillions");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Float:  " + Float.MIN_VALUE + " " + Float.MAX_VALUE + " ");
        System.out.println("Double: " + Double.MIN_VALUE + " " + Double.MAX_VALUE + " ");
//        All wrapping classes are ways of creating a reference variable to a primitive type.
//        They have handy methods you can use with those values.
//        All of these classes (namely, Integer, Short, Byte, Long, Float and Double) inherit the class Number.
//        Therefore, you can use polymorphism based on this class.
//        Cast between two reference variables of wrapping classes are not allowed since there
//        has to be used polymorphism on object conversion.
        Integer num = 10;
//        Long anotherNum = num; //Not allowed!!
        int n1 = 10;
        long anotherNum = n1; //Great since they are primitive type variables!
        Number number = num;
        Long bigNumber = 300L;
        number = bigNumber; //Using polymorphism!
    }
}
