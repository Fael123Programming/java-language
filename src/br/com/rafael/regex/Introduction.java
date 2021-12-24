package br.com.rafael.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Introduction {
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
        String information = "adjan0esdn aksjdjaskd jasdjasdajslkdjj0e23o1341o312 i1j23oi12o3 qosdsc 000-230 d" +
                "asdn 2oneroj2323r90 dnf oiwjfu0e sdcdc+-+ 2423r d dcsdconjoio*(*()*(*90a asd90as8d0as98d098sa098d";
        pat = Pattern.compile("0e");
        mat = pat.matcher(information);
        System.out.println("Text: " + information);
        System.out.println("Expression: " + mat.pattern());
        System.out.println("Indices\t\tMatched text");
        while (mat.find())
            System.out.println(mat.start() + " \t\t" + mat.group());
    }
}
