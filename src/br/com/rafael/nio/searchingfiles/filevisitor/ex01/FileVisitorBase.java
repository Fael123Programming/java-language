package br.com.rafael.nio.searchingfiles.filevisitor.ex01;

import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

public abstract class FileVisitorBase extends SimpleFileVisitor<Path> {
    protected String termination;
    protected int filesVisited;

    public FileVisitorBase(String termination) {
        this.termination = termination;
    }

    public int getFilesVisited() {
        return filesVisited;
    }
}
