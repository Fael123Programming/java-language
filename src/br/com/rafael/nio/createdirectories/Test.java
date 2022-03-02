package br.com.rafael.nio.createdirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//The principal classes we have in java.nio are:
//Path (an interface, indeed), Paths and Files.

public class Test {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/leafar/documents/prg/code/java/java-language/src/br/com/rafael/anonymous_class/" +
                "anon/TestXerk.java");
//      Through class Paths we can get Path instances. Of course, we say these objects are not
//      direct instances of Path but of concrete classes that implement it.
        Path p2 = Paths.get("/home/leafar/documents/prg", "code", "java/java-language", "src/br/com/rafael",
                "anonymous_class", "anon", "Xerk.java");
//      That's another way of getting these objects.
        System.out.println(p1.toAbsolutePath()); //Returns the whole path.
        System.out.println(p2.toAbsolutePath());
        File file = p1.toFile();
        Path newP1 = file.toPath();
//      File and Path can be cast between them
        Path newDir = Paths.get("newDir");
        Path multipleDirectories = Paths.get("src/br/com/rafael/dir/subdir/subsubdir");
        try {
            if (Files.notExists(newDir)) //Use this method to avoid an exception to be thrown.
                Files.createDirectory(newDir);
            if (Files.notExists(multipleDirectories))
                Files.createDirectories(multipleDirectories); //Create nested folders!
        } catch(IOException ignore) {
            System.out.println("If we get here it means the folder we tried to create already exists");
        }

    }
}
