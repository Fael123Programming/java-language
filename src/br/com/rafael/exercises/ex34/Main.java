package br.com.rafael.exercises.ex34;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[10];
        String student = "Peter Parker";
        names[0] = student; //Even though Strings are objects only the value is copied.
        student = null; //Change here does not affect names[0].
        System.out.println(names[0]);
        System.out.println(student);
    }
}
