package br.com.rafael.serialization.ex01;

import java.io.*;
import java.util.Objects;

public class StudentSaver {
    public void saveInFile(Student s) throws NullPointerException {
        Objects.requireNonNull(s, "student cannot be null");
        try (ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream("src/br/com/rafael/" +
                "serialization/ex01/students.ser"))) {
            objectStream.writeObject(s);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
