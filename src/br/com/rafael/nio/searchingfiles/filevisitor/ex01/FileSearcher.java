package br.com.rafael.nio.searchingfiles.filevisitor.ex01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

public class FileSearcher extends SimpleFileVisitor<Path> {
    private String termination;
    private Path origin;
    private final boolean showAbsolutePath;
    private int filesSearched;

    public FileSearcher(String termination, Path origin) {
        checkNull(termination, origin);
        checkTermination(termination);
        this.termination = prepare(termination);
        this.origin = origin;
        this.showAbsolutePath = false;
    }

    public FileSearcher(String termination, Path origin, boolean showAbsolutePath) {
        checkNull(termination, origin);
        checkTermination(termination);
        this.termination = prepare(termination);
        this.origin = origin;
        this.showAbsolutePath = showAbsolutePath;
    }

    public void search() {
        try {
            FileVisitorBase fileVisitor = showAbsolutePath ? new FileVisitorAbsolute(termination) : new FileVisitor(termination);
            Files.walkFileTree(origin, fileVisitor);
            filesSearched = fileVisitor.getFilesVisited();
        } catch(IOException ignore) {
            System.out.println("IOException has been thrown.");
            System.out.println("Check the path you entered to this object");
            System.out.println("and also the file termination");
        }
    }

    public int getFilesSearched() {
        return filesSearched;
    }

    public String getTermination() {
        return termination;
    }

    public void setTermination(String termination) {
        checkNull(termination);
        checkTermination(termination);
        this.termination = prepare(termination);
    }

    public Path getOrigin() {
        return origin;
    }

    public void setOrigin(Path path) {
        checkNull(path);
        origin = path;
    }

    private String prepare(String termination) {
        return "." + termination.trim();
    }

    private void checkNull(Object... objects) {
        for (Object obj : objects)
            if (obj == null)
                throw new IllegalArgumentException("Cannot receive any null value");
    }

    private void checkTermination(String termination) {
        if (termination.isBlank())
            throw new IllegalArgumentException("Cannot receive the following termination: " + termination);
    }
}
