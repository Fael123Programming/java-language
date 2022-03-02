package br.com.rafael.nio.copyingafile;

import java.nio.file.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Path source = Paths.get("/home/leafar/documents/prg/docs/typing_of_languages/info.png");
        Path target = Paths.get("src/br/com/rafael/nio/copyingafile/infoCopied.png");
        try {
            if (Files.notExists(target))
                Files.copy(source, target);
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING); //Override a file if it exists.
        } catch(IOException ignore) {
            System.out.println("Despised exception");
        }
    }
}
