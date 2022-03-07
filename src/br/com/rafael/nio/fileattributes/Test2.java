package br.com.rafael.nio.fileattributes;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BasicFileAttributes fileAttributes; //Attributes that are common for all OS.
        PosixFileAttributes posixFileAttributes; //Attributes that are common for all posix-based OS (such as Linux distros).
        DosFileAttributes dosFileAttributes; //Attributes that are common for all dos-based OS (such as Windows).
//      All of them provide read-only methods!
        Path path = Paths.get("src/br/com/rafael/abstract_classes/Employee.java");
        fileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("There go some attributes of a file");
        System.out.println("Creation time: " + fileAttributes.creationTime());
        System.out.println("Last access time: " + fileAttributes.lastAccessTime());
        System.out.println("Last modified time: " + fileAttributes.lastModifiedTime());
        System.out.println("Is it a directory? " + fileAttributes.isDirectory());
        System.out.println("Is it a regular file? " + fileAttributes.isRegularFile());
//      To change the attributes of a file you should use another interfaces.
//      BasicFileAttributeView, PosixFileAttributeView, DosFileAttributeView, FileOwnerAttributeView, AclFileAttributeView
        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime lastModified = fileAttributes.lastModifiedTime();
        FileTime creation = fileAttributes.creationTime();
        FileTime access = FileTime.fromMillis(System.currentTimeMillis());
        basicFileAttributeView.setTimes(lastModified, access, creation);
        fileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("------------------------------------------------------");
        System.out.println("Creation time: " + fileAttributes.creationTime());
        System.out.println("Last access time: " + fileAttributes.lastAccessTime());
        System.out.println("Last modified time: " + fileAttributes.lastModifiedTime());
    }
}
