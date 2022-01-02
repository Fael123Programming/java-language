package br.com.rafael.io.part1.reading_and_writing_on_files;

import br.com.rafael.io.part1.handy_for_projects.FileHandler;

public class Main {
    public static void main(String[] args){
        //System.out.println(FileHandler.readFile("src/java_language/java_io/texts/captmidn.txt"));
        FileHandler.appendTo("src/java_language/java_io/texts/goodmorning.txt","Okay...");
        System.out.println(FileHandler.readFile("src/java_language/java_io/texts/goodmorning.txt"));
    }
}
