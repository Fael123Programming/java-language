package br.com.rafael.nio.searchingfiles.filevisitor;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorAbsolute extends FileVisitorBase {
    public FileVisitorAbsolute(String termination) {
        super(termination);
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        if (path.getFileName().toString().endsWith(this.termination)) {
            System.out.println(path.getFileName().toAbsolutePath());
            super.filesVisited++;
        }
        return FileVisitResult.CONTINUE;
    }
}
