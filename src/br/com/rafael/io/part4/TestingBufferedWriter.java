package br.com.rafael.io.part4;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class TestingBufferedWriter {
    public static void main(String[] args) {
        File file = new File("/home/leafar/documents/prg/code/py/exercises/script02.py");
//      We have to combine a FileWriter (which is, namely, a writer) with a BufferedWriter.
//      Buffered I/O is much better than traditional I/O. It provides higher efficiency!
//      When chaining writers in the following way, once the outer one is closed they all
//      assume the same state.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));) {
            bufferedWriter.write("name = input('Tell me, how are you called?: ')");
            bufferedWriter.newLine();
            bufferedWriter.write("print(f'Enchanté {name}!')");
            bufferedWriter.newLine();
            bufferedWriter.write("print('Bienvenue')");
            bufferedWriter.flush();
//          Flushing is only needed when writing on a file.
        } catch(IOException ignore) {}
    }
}
