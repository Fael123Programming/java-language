package br.com.rafael.nio.searchingfiles.filevisitor;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestingFileVisitor {
    public static void main(String[] args) {
        Path origin = Paths.get("/home");
        FileSearcher fileSearcher = new FileSearcher("py", origin);
        fileSearcher.search();
    }
}
