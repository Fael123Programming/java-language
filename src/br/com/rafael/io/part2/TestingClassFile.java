package br.com.rafael.io.part2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestingClassFile {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("path.separator"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.name"));
        final String PATH = "src/br/com/rafael/io/part2/data.txt";
        File file = new File(PATH);
        try {
            if (file.createNewFile())
                System.out.println("File created at " + PATH);
            else
                System.out.println("A file at " + PATH + " already exists!");
            if (file.isFile())
                System.out.println("File");
            else if (file.isDirectory())
                System.out.println("Directory");
            System.out.println("Last modified: " + (new Date(file.lastModified())));
            if (file.isHidden())
                System.out.println("This file is hidden (has the dot prefix)");
            if (file.exists())
                System.out.println(PATH + " exists!");
            else
                System.out.println(PATH + " does not exist!");
            if (file.canRead())
                System.out.println(PATH  + " is able to be read...");
            if (file.canWrite())
                System.out.println(PATH + " is able to be written to...");
            System.out.println("Abstract pathname is " + file.getPath());
            System.out.println("Absolute pathname is " + file.getAbsolutePath());
            System.out.println("The actual OS uses \"" + File.separator + "\" as default separator");
            System.out.println("Parent pathname: " + file.getParent());
            System.out.println(file.getFreeSpace() + " bytes of free space on this file's partition");
            System.out.println(file.getFreeSpace() / 1024.0 / 1024.0 / 1024.0 + " GBs of free space");
            if (file.delete())
                System.out.println(PATH + " was deleted...");
            else
                System.out.println(PATH + " does not exist to be deleted");
        } catch(IOException ioe) {
            System.out.println("An IOException has been thrown...");
        }
        File dir = new File("py_code");
        if (dir.mkdir())
            System.out.println("py_code was created");
        else
            System.out.println("py_code already exists");
//      file.createNewFile(); -> to create a new file
//      file.exists(); -> to check whether the specified abstract pathname exists or not
//      file.delete(); -> to delete the specified file if existent
//      file.canRead(); -> to check whether the specified pathname has permission to be read or not
//      file.canWrite(); -> to check whether the specified pathname has permission to be written to or not
//      file.getPath(); -> the abstract pathname given during the creation of the object
//      file.getAbsolutePath(); -> the absolute path of the given file object (from root through your project at your
//      storage)
//      file.isHidden(); -> to check if the file is hidden
//      file.isFile();
//      file.isDirectory();

    }
}
