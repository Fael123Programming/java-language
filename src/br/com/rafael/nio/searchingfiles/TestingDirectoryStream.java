package br.com.rafael.nio.searchingfiles;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestingDirectoryStream {
    public static void main(String[] args) {
        Path directory = Paths.get("src/br/com/rafael/collections_framework");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
            for (Path path : stream) //You can iterate over the files in the directory...
                System.out.println(path.getFileName());
        } catch(IOException ignore) {
            System.out.println("Something unexpected happened");
        }
    }
}
