package br.com.rafael.exercises.ex21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte b = 19;
        short s = 19;
        int i = 19;
        long l = 81923L;
        int hexNum = 0x1a; //Hexadecimal number.
        int binNum = 0b11010; //Binary number.
        System.out.println(hexNum + " " + binNum);
        float f = 3.14f; //Either f or F shall be used.
        double d = 3.14d; //You can use d, D or nothing.
        double d2 = 314e-2; //Scientific notation.
        System.out.println(d2);
        System.out.println(Main.class); //Class literal: the object that represents the class itself.
        long creditCardNumber = 1234_5678_9012_3456L;
        float pi = 3.14_15F;
        System.out.println(creditCardNumber);
        System.out.println(pi);
        int fullDate = 2021_03_07;
        System.out.println(fullDate);
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Jorge", "Marianna", "Michael"}
        };
        System.out.println(names[0][0] + names[1][2]);
        System.out.println(names.length);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copiedNumbers = new int[3];
        System.arraycopy(numbers, 4, copiedNumbers, 0, 3);
        Arrays.stream(copiedNumbers).mapToObj(n -> n + " ").forEach(System.out::print);
        int[] anotherCopied = Arrays.copyOfRange(numbers, 4, 7);
        System.out.println();
        Arrays.stream(anotherCopied).mapToObj(n -> n + " ").forEach(System.out::print);
        System.out.println();
        System.out.println("numbers[" + Arrays.binarySearch(numbers, 7) + "]=" + "7");
        System.out.println(Arrays.equals(copiedNumbers, anotherCopied));
        Arrays.fill(numbers, 900);
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
        System.out.println();
        final int SIZE = 100;
        int[] severalIntegers = new int[SIZE];
        for (int n = SIZE; n > 0; n--)
            severalIntegers[SIZE - n] = n; //Worst case: decreasing order.
        Arrays.parallelSort(severalIntegers);
        Arrays.stream(severalIntegers).forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println(Arrays.toString(severalIntegers));
    }
}
