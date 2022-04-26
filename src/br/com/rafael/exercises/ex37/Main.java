package br.com.rafael.exercises.ex37;

public class Main {
    public static void main(String... args) {
        CharSequence str = new ReversedString("rafael quintino");
        System.out.println(str);
        System.out.println("Length is " + str.length());
        System.out.println("Char at position 3 is " + str.charAt(3));
        System.out.println("Chars from position 3 to 5 are " + str.subSequence(3, 6));
    }
}
