package br.com.rafael.nio.searchingfiles.filevisitor.ex01;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitor extends FileVisitorBase {
    public FileVisitor(String termination) {
        super(termination);
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        if (path.getFileName().toString().endsWith(this.termination)) {
            System.out.println(path.getFileName().getFileName());
            super.filesVisited++;
        }
        return FileVisitResult.CONTINUE;
    }
}
