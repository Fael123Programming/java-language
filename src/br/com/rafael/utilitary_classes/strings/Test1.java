package br.com.rafael.utilitary_classes.strings;

public class Test1 {
    public static void main(String[] args) {
//        Strings are reference variables of class String in Java.
//        They are immutable.
//        All operations in so that you modify a string, you are actually creating a new one.
//        All strings similar in content are indeed pointing to the same object in a pool
//        of strings. This pool of immutable objects is called technically String Constant Pool.
        String name = "Josh";
        String anotherName = "Josh";
        System.out.println(name == anotherName); //true!!! The same memory reference.
        name += anotherName; //A new String object is created and assigned with "JoshJosh".
//        Its memory reference is now pointed by name.
        System.out.println(name);
        String thirdString = "Josh", fourthString = name;
//        We have in our String Constant Pool: "Josh" and "JoshJosh" only, but they are being
//        referred to by multiple reference variables.
        System.out.println(anotherName == thirdString);
        System.out.println(name == fourthString);
//        The way Java handles strings spares memory resources!!!
        String str = name.concat(anotherName).concat(thirdString).concat(fourthString);
        System.out.println(str);
//        .concat() or just +=.
        System.out.println(str.charAt(0));
        System.out.println(str.equalsIgnoreCase("joshjoshjoshjoshjoshjosh"));
        System.out.println(str.length()); //A method!!!
        String[] array = new String[10];
        System.out.println(array.length); //An attribute.
        str = str.replace("Josh", "Jesus");
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0, 5)); //5th character was not included...
        String weirdString = "\s\s\s\sA\s\s\s\s";
        System.out.println(weirdString);
        System.out.println(weirdString.trim());
    }
}
