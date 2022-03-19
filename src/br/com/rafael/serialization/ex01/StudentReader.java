package br.com.rafael.serialization.ex01;

import java.io.*;

public class StudentReader {
    public Student readStudent() {
        Student student = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/br/com/rafael/" +
                "serialization/ex01/students.ser"))) {
            student = (Student) inputStream.readObject();
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student;
    }
}
