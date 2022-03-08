package br.com.rafael.nio.fileattributes;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class Test4 {
    public static void main(String... args) throws IOException {
        Path path = Paths.get("src/br/com/rafael/nio/fileattributes/script.py");
        if (Files.notExists(path))
            Files.createFile(path);
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println("Displaying a set with the permissions for the file: ");
        System.out.println(posixFileAttributes.permissions());
        System.out.println("--------------------------------------------------");
        System.out.println("Changing permissions...");
        PosixFileAttributeView posixFileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> newPermissions = PosixFilePermissions.fromString("r--r--r--");
//      Only read permission will be granted for the owner of the file, the group record and others.
        posixFileAttributeView.setPermissions(newPermissions);
//        Files.setPosixFilePermissions(path, newPermissions); -> Another way of doing the same thing...
        posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println("Displaying the new permissions:");
        System.out.println(posixFileAttributes.permissions());
        System.out.println("script.py is read-only hereafter...");

    }
}
