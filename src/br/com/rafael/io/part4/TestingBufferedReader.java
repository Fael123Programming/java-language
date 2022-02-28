package br.com.rafael.io.part4;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestingBufferedReader {
    public static void main(String[] args) {
        File file = new File("/home/leafar/documents/prg/code/py/exercises/script02.py");
//      As done when writing, we need to chain readers together.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));) {
            String str;
            while((str = bufferedReader.readLine()) != null)
                System.out.println(str);
//          When the end of the stream is reached, readLine() returns null.
        } catch(IOException ignore) {}
    }
}
