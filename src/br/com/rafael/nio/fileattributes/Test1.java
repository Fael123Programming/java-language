package br.com.rafael.nio.fileattributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Date dt1 = new GregorianCalendar(1997, Calendar.DECEMBER, 1).getTime();
        File file = new File("src/br/com/rafael/nio/fileattributes/file.txt");
        if (!file.exists()) {
            try {
                if (file.createNewFile())
                    System.out.println("Got created...");
            } catch(IOException ignore) {
                System.out.println("Exception block 1");
            }
        }
        System.out.println("Last modified: " + new Date(file.lastModified()));
        if(file.setLastModified(dt1.getTime()))
            System.out.println("Last modified got changed...");
        System.out.println("Last modified (new): " + new Date(file.lastModified()));
        if(file.delete())
            System.out.println("Got wiped up...");
        System.out.println("------------------------------------------------------------");
        Path path = Paths.get("src/br/com/rafael/nio/fileattributes/otherFile.txt");
        try {
            if (Files.notExists(path)) {
                Files.createFile(path);
                System.out.println("New file created...");
            }
        } catch(IOException ignore) {
            System.out.println("Exception block 2");
        }
        try {
            System.out.println("Last modified: " + Files.getLastModifiedTime(path));
            FileTime fileTime = FileTime.fromMillis(dt1.getTime());
            Files.setLastModifiedTime(path, fileTime);
            System.out.println("Last modified (new): " + Files.getLastModifiedTime(path));
            Files.deleteIfExists(path);
            System.out.println("Got deleted...");
        } catch(IOException ignore) {
            System.out.println("Exception block 3");
        }
        System.out.println("------------------------------------------------------------");
        path = Paths.get("src/br/com/rafael/garbage_collector/Test.java");
        System.out.println("Showing information about a file through Files class");
        System.out.println("Is it readable? " + Files.isReadable(path));
        System.out.println("Is it writable? " + Files.isWritable(path));
        System.out.println("Is it executable? " + Files.isExecutable(path));
        System.out.println("Last modified date: " + Files.getLastModifiedTime(path));
    }
}
