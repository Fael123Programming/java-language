package br.com.rafael.io.streamofbytes.inputstream;

//InputStream is for when you are reading bytes from a source.

import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;

public class Main {
    private static final String PATH = "src/br/com/rafael/io/streamofbytes/data.txt";

    public static void main(String[] args) {
        readBytesEnhanced();
    }

    private static void readBytes() {
        try (FileInputStream inStream = new FileInputStream(PATH)) {
            int read;
            while ((read = inStream.read()) != -1)
                System.out.print((byte) read + " ");
            System.out.println("\nData read successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readBytesEnhanced() {
//      Reading with a buffer is faster than traditional approach because
//      it spares resources of being accessed several times. In this case,
//      the SSD itself because its data is put in a buffer in RAM.
        try (BufferedInputStream inBuffer = new BufferedInputStream(new FileInputStream(PATH))) {
            int read;
            while ((read = inBuffer.read()) != -1)
                System.out.print((byte) read + " ");
            System.out.println("\nData read successfully!");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
