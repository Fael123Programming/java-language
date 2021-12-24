package br.com.rafael.tokens_delimiters;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String names = "William, Paulo, Joana, Camila, Joana, Joao, Mateus";
        String anotherNames = "Joseph8912312Andrew81230123Josh";
        System.out.println(Arrays.toString(names.split(", "))); //Easiest way to use a token with a String.
        System.out.println(Arrays.toString(anotherNames.split("\\d+")));
        Scanner scan = new Scanner(names);
//      By default, Scanner uses " " as standard token (or delimiter).
        while (scan.hasNext())
            System.out.println(scan.next());
        scan.close();
        scan = new Scanner(anotherNames);
        scan.useDelimiter("\\d+"); //Any singular or group of digits!
        while (scan.hasNext())
            System.out.print(scan.next() + " ");
        System.out.println();
        scan.close();
        scan = new Scanner(anotherNames);
        scan.useDelimiter("[a-zA-Z]+"); //A string of alphabetic characters.
        while (scan.hasNext())
            System.out.println(scan.next());
        scan.close();
    }
}
