package br.com.rafael.io.part5;

import java.io.File;
import java.io.IOException;

public class TestFileDirectory {
    public static void main(String[] args) {
//      We may handle directories even with the File class.
//      File instances are immutable.
        File pythonScripts = new File("/home/leafar/documents/prg/code/py/exercises");
        if (pythonScripts.mkdir())
            System.out.println("Folder created at " + pythonScripts.getAbsolutePath());
        File newScript = new File(pythonScripts, "script03.py");
        try {
            if (newScript.createNewFile())
                System.out.println("New file created at " + newScript.getAbsolutePath());
        } catch (IOException ignore) {
            System.out.println("IOException has been raised...");
        }
        File local = new File("src/br/com/rafael/io/part5/blabla.txt");
        try {
            if (local.createNewFile())
                System.out.println("File created at " + local.getAbsolutePath());
        } catch (IOException ignore) {
        }
        if (local.renameTo(new File("src/br/com/rafael/io/part5/spy_information.txt")))
            System.out.println("File renamed");
        if (pythonScripts.renameTo(new File("/home/leafar/documents/prg/code/py/scripts")))
            System.out.println("Folder got renamed");
//      You can rename either files or folders!
        if(pythonScripts.delete()) //You can delete either a file or a folder (the latter must be empty).
            System.out.println(pythonScripts.getPath() + " was wiped");
        fetchFiles();
    }

    private static void fetchFiles() {
        File fileObject = new File("src/br/com/rafael/io"); //It represents a folder.
        String[] files = fileObject.list(); //Grabbing all files and folders inside io.
        for (String str : files)
            System.out.println(str);
    }
}
