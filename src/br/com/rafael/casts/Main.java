package br.com.rafael.casts;

//We have some type of casts in Java:
//-> Upcast: when you get a variable cast into a larger type.
//Ex.: cast an int into a long.
//-> Downcast: when you get a variable cast into a smaller type.
//In this case, you may lose information.
//Ex.: cast an int into a short.
//Upcast is implicit (nothing should be done by programmer)
//Downcast is explicit (you must tell it to Java)
//Okay, those are basic concepts when talking about casts of variables.
//In objected-oriented programming, we have widening and narrowing. These
//concepts are only applied in inheritance context.
//-> Widening: when you get an object cast back on inheritance tree, that is,
//referencing to it through its super classes (polymorphism).
//-> Narrowing: when you specialize a reference to an object, usually applying
//polymorphism such that the reference to the object is more close to the
//concrete class of it.

public class Main {
    public static void main(String[] args) {
        int x = 10;
        String xStr = "" + 10;
        xStr = Integer.toString(x);
        x = Integer.parseInt(xStr);
        //Every class that represents number (Short, Integer, Long, Float and Double) has those methods: toString and parse.
        //Let us use the wrapping classes with a keeper object.
        Keeper kp = new Keeper();
        kp.add(x);//Autoboxing! A primitive type is cast to a reference variable automatically.
        long big = 123123L;
        kp.add(big);
        short small = 1;
        kp.add(small);
        Integer newX = x;
        System.out.println(newX);
        System.out.println(newX.intValue());
        newX = null; //It does not leave of being a reference variable!
        System.out.println(newX);
        long n1 = ((long) Integer.MAX_VALUE) + 1;
        int n1Int = (int) n1; //You may lose information.
        System.out.println("n1: " + n1);
        System.out.println("n1Int: " + n1Int);
        byte n1Byte = (byte) n1Int;
        System.out.println("n1Byte: " + n1Byte);
        float f1 = 3.145f;
        double f1Double = f1; //Upcast!
        System.out.println("f1: " + f1);
        System.out.println("f1Double: " + f1Double);
    }
}
