package br.com.rafael.nio.normalization;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
//      "../" means the parent dir.
//      "./" means this dir.
        String dir = "src/br/com/rafael/nio/normalization";
        String pathFile = "/../../../../../.idea/misc.xml";
        Path path = Paths.get(dir + pathFile);
        System.out.println(path);
        System.out.println(path.normalize()); //Removes all `../`
        Path path2 = Paths.get("a/./b/./c");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
