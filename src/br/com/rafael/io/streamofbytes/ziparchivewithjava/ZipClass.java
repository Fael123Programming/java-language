package br.com.rafael.io.streamofbytes.ziparchivewithjava;

//To create a zip file is nothing but compressing a set of files together.

import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.*;

public class ZipClass {
    public static void main(String[] args) {
        final String PATH = "src/br/com/rafael/";
        Path dirZipArchive = Paths.get(PATH + "io/streamofbytes/ziparchivewithjava");
        Path dirFilesToBeZipped = Paths.get(PATH + "anonymous_class/ex2");
        Path zipFile = dirZipArchive.resolve("nio.zip");
        try (ZipOutputStream zipStream = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
             DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirFilesToBeZipped);
        ) {
            for (Path path : dirStream) {
                zipStream.putNextEntry(new ZipEntry(path.getFileName().toString()));
                BufferedInputStream bufferedStream = new BufferedInputStream(new FileInputStream(path.toFile()));
                byte[] bytes = new byte[2048];
                int read;
                while ((read = bufferedStream.read(bytes)) != -1)
                    zipStream.write(bytes, 0, read);
                zipStream.flush();
                zipStream.closeEntry();
                bufferedStream.close();
            }
            System.out.println("zip archive created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
