package br.com.rafael.nio.searchingfiles.filevisitor.ex02;

import java.nio.file.Paths;

public class TestDirPrinter {
    public static void main(String[] args) {
        DirPrinter dirPrinter = new DirPrinter(Paths.get("/home/leafar/documents/prg/code/"));
        dirPrinter.printFromOriginDir();
    }
}
