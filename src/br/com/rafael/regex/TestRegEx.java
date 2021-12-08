package br.com.rafael.regex;

import java.util.regex.*;

public class TestRegEx {
    public static void main(String[] args) {
//        An internal language of programming languages based on patterns.
//        Two classes were prepared to handle them: Pattern and Matcher.
//        Pattern to represent patterns and Matcher to find them.
        String expression = "aba", text = "abababa";
        Pattern pat = Pattern.compile(expression);
        Matcher mat = pat.matcher(text);
        System.out.println("Text:       " + text);
        System.out.println("Expression: " + mat.pattern());
        System.out.print("Indices:    ");
        while (mat.find())
            System.out.print(mat.start() + " ");
        System.out.println();
        String information = "adjansdn aksjdjaskd jasdjasdajslkdjj23o1341o312 i1j23oi12o3 qosdsc 000-230 d" +
                "asdn 2oneroj2323r90 dnf oiwjfu0e sdcdc+-+ 2423r d dcsdconjoio*(*()*(*90a asd90as8d0as98d098sa098d";
        search("0e", information);
    }

    private static void search(String wantedExpression, String baseText) {
        Pattern pat = Pattern.compile(wantedExpression);
        Matcher mat = pat.matcher(baseText);
        System.out.println("Text:\n" + baseText);
        System.out.println("Expression: " + mat.pattern());
        System.out.print("Indices:\t");
        while (mat.find())
            System.out.print(mat.start() + " ");
    }
}
