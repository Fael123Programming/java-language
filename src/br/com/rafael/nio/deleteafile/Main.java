package br.com.rafael.nio.deleteafile;

import java.nio.file.*;
import java.io.*;

public class Main {
    public static void main(String... args) {
        Path p1 = Paths.get("src/br/com/rafael/temp.txt");
        try {
            if (Files.notExists(p1))
                Files.createFile(p1);
            Files.deleteIfExists(p1);
        } catch(IOException ignore) {}
    }
}
