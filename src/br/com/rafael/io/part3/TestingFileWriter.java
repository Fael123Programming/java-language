package br.com.rafael.io.part3;

import java.io.*;

//Testing class FileWriter from java.io API.
//It provides you with two handy methods for writing on a file: write and append.
//If the file passed in constructor does not yet exist, it is created.

public class TestingFileWriter {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "/src/br/com/rafael/io/part3/file.txt");
        try (FileWriter writer = new FileWriter(file /*, true <- Append the info instead of override*/)) {
            writer.write("New data record into this file\nJava has lots of good classes to use with I/O streams");
            writer.flush(); //Cleanse the buffer where the information was kept.
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
