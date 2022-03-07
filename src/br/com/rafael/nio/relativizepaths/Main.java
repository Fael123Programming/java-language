package br.com.rafael.nio.relativizepaths;

import java.nio.file.Paths;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
//      How can we reach another path from a current one.
//      Of course those paths must be linked to each other.
        Path path1 = Paths.get("/home/leafar");
        Path path2 = Paths.get("/home/leafar/java/Car.java");
        System.out.println(path1.relativize(path2)); //It's the opposite operation of resolving a path.
        Path absolute1 = Paths.get("/home/leafar");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/leafar/java/Car.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/Employee.java");
        System.out.println("absolute1 with absolute3: " + absolute1.relativize(absolute3));
        System.out.println("absolute3 with absolute1: " + absolute3.relativize(absolute1));
        System.out.println("absolute1 with absolute2: " + absolute1.relativize(absolute2));
        System.out.println("absolute1 with relative2: " + relative1.relativize(relative2));
//        System.out.println("absolute1 with relative1: " + absolute1.relativize(relative1));
//        It throws an exception IllegalArgumentException because both paths are not linked to each other.
    }
}
