package br.com.rafael.regex;

import java.util.regex.*;

public class TestRange {
    public static void main(String[] args) {
//    [] -> range or character set.
//        You can put symbols that you want to look for inside the brackets.
//        Ex.: [abcABC] will search for a, b, c, A, B or C in a text.
//             [a-cA-C] will yield the same result.
//             [0-9] will search for any digit in a text (0 through 9).
        String text = "My mom gave me 29 dollars and spent 15 at school";
        Pattern pat = Pattern.compile("[12a-c]"); //We want 1, 2, a, b or c.
        Matcher mat = pat.matcher(text);
        while (mat.find())
            System.out.println(mat.start() + " " + mat.group());
    }
}
