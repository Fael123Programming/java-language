package br.com.rafael.nio.fileattributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/br/com/rafael/nio/fileattributes/new_script.py");
        if (Files.notExists(path))
            Files.createFile(path); //Creating new file if nonexistent.
        Files.setAttribute(path, "dos:readonly", true);
        Files.setAttribute(path, "dos:hidden", true);
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println("Is it read-only? " + dosFileAttributes.isReadOnly());
        System.out.println("Is it hidden? " + dosFileAttributes.isHidden());
        DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        dosFileAttributeView.setHidden(false);
        dosFileAttributeView.setReadOnly(false);
        dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println("-----------------------------------------------------");
        System.out.println("Is it read-only? " + dosFileAttributes.isReadOnly());
        System.out.println("Is it hidden? " + dosFileAttributes.isHidden());
    }
}
