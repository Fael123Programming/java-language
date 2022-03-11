package br.com.rafael.nio.searchingfiles.filevisitor.ex03;

//Searching all files from a given directory that contain 'test' and terminate with '.class' or '.java'.

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class TestingPathMatcher2 {
    public static void main(String[] args) {
        Path origin = Paths.get("src/"); //Seek in the whole project...
        try {
            Files.walkFileTree(origin, new FileVisitor());
        } catch(IOException ioException) {
            System.out.println("Exception has been thrown");
        }
    }
}

//We may have multiples classes inside a unique '.java' file since we
//have only one public class and this class names the file.

class FileVisitor extends SimpleFileVisitor<Path> {
    private final PathMatcher matcher;

    {
        matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{class,java}");
//      Any directory, 'Test' between name and either '.class' or '.java' as extension.
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file))
            System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}
