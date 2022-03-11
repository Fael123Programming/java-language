package br.com.rafael.nio.searchingfiles.filevisitor.ex01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestingFileVisitor {
    public static void main(String[] args) {
        Path origin = Paths.get("/home");
        FileSearcher fileSearcher = new FileSearcher("java", origin);
        fileSearcher.search();
        System.out.println(fileSearcher.getFilesSearched());
    }
}
