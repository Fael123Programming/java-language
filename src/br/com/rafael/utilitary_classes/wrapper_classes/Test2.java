package br.com.rafael.utilitary_classes.wrapper_classes;

public class Test2 {
    public static void main(String[] args) {
//        Autoboxing: get a primitive type value into its wrapper class using a reference variable.
//        Unboxing: it is the opposite. Come from a boxed primitive type value into a primitive only.
//        In the latest versions of Java, they are done automatically.
        Long boxedLong = 300000321023L; //Autoboxing.
        long unboxedLong = boxedLong; //Unboxing.
        Boolean logic = true;
        System.out.println(Integer.parseInt("123") % 10);
        int n = Integer.parseInt("100");
        System.out.println(n);
        Integer i = Integer.valueOf(n);
//        .valueOf()   -> returns a wrapper.
//        .parseType() -> returns a primitive.
//        Both Character and String classes have very useful methods.
//        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html
//        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
    }
}
