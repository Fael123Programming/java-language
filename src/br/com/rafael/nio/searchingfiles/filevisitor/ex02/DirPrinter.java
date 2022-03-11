package br.com.rafael.nio.searchingfiles.filevisitor.ex02;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class DirPrinter extends SimpleFileVisitor<Path> {
    private final Path originDir;

    public DirPrinter(Path originDir) {
        this.originDir = Objects.requireNonNull(originDir);
    }

    public void printFromOriginDir() {
        try {
            Files.walkFileTree(originDir, this);
        } catch(IOException ignore) {
            System.out.println("An exception has been thrown");
        }
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes basicFileAttributes) {
        System.out.println("D: " + dir.toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException ioException) {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes basicFileAttributes) {
        System.out.println("F: " + file.toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException ioException) {
        return FileVisitResult.CONTINUE;
    }
}
