package br.com.rafael.exercises.ex04;

public class Test {
    public static void main(String[] args) {
        double value = 7.89123D;
        int integer = (int) value; //Explicit cast.
        value = 10; //Implicit cast.
        System.out.println(value);
        System.out.println(integer);
        integer = 128;
        byte aNumber = (byte) integer; //Overflow.
//        If the supported range is overflowed, then Java will reset the value starting to count
//        from the beginning. Example: for 128 to be converted to byte, there will be -128.
        System.out.println("aNumber = " + aNumber);
        long l = 12;
        int i1 = 15, i2;
        i2 =  i1 + (int) l;
//        Summing an integer with a long yields a long.
        byte b1 = 0, b2 = 10;
        b2 = (byte) (b1 + (byte) i1);
//        Summing two bytes yields an integer strangely.
//        Basically, when operating over two types the result will
//        be of that one which occupies the biggest space.
//        Java stores the result of expressions in at minimum an integer.
//        Boolean values cannot be converted to any type.
        value = 90.123123D;
        System.out.println(++value);
        int[] numbers = new int[10]; //All 10 variables are initialized with zero.
        for (int n : numbers)
            System.out.println(n);
//        System.out.println(numbers[10]);
    }
}
