package br.com.rafael.io.part3;

import java.io.*;

public class TestingFileReader {
    public static void main(String[] args) {
        final String PATH = System.getProperty("user.dir") + "/src/br/com/rafael/io/part3/file.txt";
        try (FileReader reader = new FileReader(PATH)) {
            /*char[] chars = new char[500];
            int length = reader.read(chars);
            for (int i = 0; i < length; i++)
                System.out.print(chars[i]);
            System.out.println();*/
            while (reader.ready())
                System.out.print((char) reader.read());
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
