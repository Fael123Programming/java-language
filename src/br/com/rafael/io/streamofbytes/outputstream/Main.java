package br.com.rafael.io.streamofbytes.outputstream;

//OutputStream is for when you are writing bytes on a target file.

import java.io.*;

public class Main {
    private static final String PATH = "src/br/com/rafael/io/streamofbytes/data.txt";
    private static final byte[] DATA = {65, 66, 67, 68, 69, 70};
//  The bytes above correspond to the letters from A through F.

    public static void main(String[] args) {
        writeBytesEnhanced();
    }

    private static void writeBytes() {
        try (FileOutputStream outStream = new FileOutputStream(PATH)) {
//         If the specified file does not exist, it is created!
            outStream.write(DATA);
            outStream.flush();
            System.out.println("Data written successfully!");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeBytesEnhanced() {
        try (BufferedOutputStream outBuffer = new BufferedOutputStream(new FileOutputStream(PATH))) {
//           Using a buffer means that you are not making a new connection with
//           your mass storage every single time. You are using a bag and transferring
//           everything at once.
            outBuffer.write(DATA);
            outBuffer.flush(); //If there remained something, throws it away.
            System.out.println("Data written successfully!");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
