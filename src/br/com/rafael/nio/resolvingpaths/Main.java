package br.com.rafael.nio.resolvingpaths;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
//      Resolve a path is to join multiple paths together.
        Path p1 = Paths.get("home/leafar/documents");
        Path p2 = Paths.get("prg/code/py");
        System.out.println(p2.resolve(p1));
        System.out.println(p1.resolve(p2));
        Path absolute = Paths.get("/home/leafar");
        Path relative = Paths.get("documents/prg/code/py/script01.py");
        System.out.println(absolute.resolve(relative));
        System.out.println(relative.resolve(absolute));
//      An absolute path starts from root always!
    }
}
