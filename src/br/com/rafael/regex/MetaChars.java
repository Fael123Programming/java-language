package br.com.rafael.regex;

import java.util.regex.*; //Pattern and Matcher.

public class MetaChars {
    public static void main(String[] args) {
//        Meta-characters: find a family of characters in a text;
//        \d -> digits (0 through 9);
//        \D -> non-digits;
//        \s -> space characters such as \s, \n, \t, \r, \f etc;
//        \S -> non-space characters;
//        \w -> alphanumeric (a-z, A-Z and 0-9) and _ (underscore);
//        \W -> non-alphanumeric and not _;
        String phrase = "Yesterday I went out to my girlfriend's home and found 4 dogs walking on the street";
        String meta = "\\d";
        Pattern pat = Pattern.compile(meta);
        Matcher mat = pat.matcher(phrase);
        System.out.println("-----------------------------------------");
        while (mat.find())
            System.out.print(mat.start() + " " + mat.group());
        System.out.println();
        System.out.println(Character.isDigit(phrase.charAt(55)));
        System.out.println("-----------------------------------------");
        meta = "\\D";
        pat = Pattern.compile(meta);
        mat = pat.matcher(phrase);
        while (mat.find())
            System.out.print(mat.start() + " " + mat.group());
        System.out.println();
        System.out.println("-----------------------------------------");
        meta = "\\s";
        pat = Pattern.compile(meta);
        mat = pat.matcher(phrase);
        while (mat.find())
            System.out.print(mat.start() + " ");
        System.out.println();
        System.out.println("-----------------------------------------");
    }
}
