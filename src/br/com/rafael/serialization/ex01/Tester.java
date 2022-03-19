package br.com.rafael.serialization.ex01;

//Serialization is to convert an object into a stream in order to save its data in a file etc.
//Serialization is used in APIs and frameworks more widely.

public class Tester {
    public static void main(String[] args) {
        StudentSaver saver = new StudentSaver();
        StudentReader reader = new StudentReader();
        Student s1 = new Student("Rafael", "rafael710");
        saver.saveInFile(s1);
        System.out.println(reader.readStudent());
//      When you deserialize an object, its class constructor isn't called.
    }
}
