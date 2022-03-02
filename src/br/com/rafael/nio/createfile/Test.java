package br.com.rafael.nio.createfile;

import java.nio.file.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
//      Create a file.
//      Using Paths.get() does not require that the arguments represent a real file or dir.
        try {
            Path fileToCreate = Paths.get("src/br/com/rafael/nio/createfile/JavaClass.java");
            if (Files.notExists(fileToCreate))
                Files.createFile(fileToCreate);
            System.out.println(fileToCreate.getParent()); //Returns the upper hierarchy of folders.
            System.out.println(fileToCreate.toAbsolutePath());
        } catch(IOException ignore) {
            System.out.println("An IOException has been thrown");
        }
    }
}
