package br.com.rafael.nio.searchingfiles.filevisitor.ex03;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class TestingPathMatcher {
    public static void main(String[] args) {
        Path p1 = Paths.get("src/br/com/rafael/privacity/Main.java"), p2 = Paths.get("Main.java");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.java");
//        '*' is a wildcard that means everything but '/'.
        System.out.println(matcher.matches(p1));
        System.out.println(matcher.matches(p2));
        System.out.println("------------------------------------");
//      '*' means anything (such as letters, digits etc).
        tryMatch(p1, "**.java"); //Consider directories.
        tryMatch(p1, "*.java"); //It does not consider directories.
        tryMatch(p1, "*"); //It does not consider directories.
        tryMatch(p1, "**"); //Consider directories.
        System.out.println("----------------------------------");
        tryMatch(p1, "*.????"); //'?' is a placeholder that indicates the quantity of chars in the extension.
        tryMatch(p1, "**.????"); //'**/*.????' works the same.
        tryMatch(p1, "**/*.????");
        System.out.println("----------------------------------");
        Path p3 = Paths.get("java-code");
        tryMatch(p3, "{java*, code*}"); //java and code together.
        tryMatch(p3, "{java, code}*"); //The same as above.
        tryMatch(p3, "{java, code}"); //Either java or code but not together.
    }

    private static void  tryMatch(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + glob);
        System.out.println("Glob (" + glob + ")=" + matcher.matches(path));
    }
}
