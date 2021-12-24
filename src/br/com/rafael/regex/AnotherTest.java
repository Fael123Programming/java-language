package br.com.rafael.regex;

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class AnotherTest {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new File("src/br/com/rafael/regex/numbers.txt"))) {
            String regex = "\\d{3}[.-]\\d{3}[.-]\\d{4}";
//            String regex = "[1359]\\d{2}[-.]\\d{3}[-.]\\d{4}"; //Only numbers that start with an odd number.
//            String regex = "\\d{3}[.-]\\d{3}[.-]7822";
            Pattern pat = Pattern.compile(regex);
            Matcher mat;
            while (scan.hasNextLine()) { //Reading that file!
                mat = pat.matcher(scan.nextLine());
                while (mat.find())
                    System.out.println(mat.group());
            }
        } catch(FileNotFoundException fnfe) {
            System.out.println("File not found");
        }
    }
}
