package br.com.rafael.debugging;

//An important thing to pay attention to in Java is the fact of concatenating strings:
//as you concatenate two things in Java, a new String object is created increasing
//the pool of strings of your program.
//This takes too much resource in a large program.

public class TestResources {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            String string = "string[" + i + "]"; //Increasing hardly the pool of strings in JVM.
            System.out.println(string);
//            Instead of doing that use StringBuilders or StringBuffers!!!
        }
    }
}
