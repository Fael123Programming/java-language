package br.com.rafael.regex;

import java.util.regex.*;

public class TestQuantifiers {
    public static void main(String[] args) {
//      Quantifiers tell how many times an item should appear in a regex.
//      They are 4:
//      ? -> zero or one occurrence;
//      * -> zero or more occurrences;
//      + -> one or more occurrences;
//      {m, n} -> from m to n occurrences;
//      {z} -> exact z occurrences;
//      Another useful metacharacters to use with quantifiers:
//      () -> used to group items to define a quantifier to them;
//      | (pipe) -> used to indicate logic OR (used inside a "()");
//      $ -> end-of-line;
//      ^ -> logic NOT (must be put inside a [] before the characters to be rejected)
//      ^ outside a [] means "all lines that begin with the following..."
//      Example of using () and |:
//      Let our regex be "o(v|c)o": there could be "ovo" or "oco" as right matched answers.
//      maca(rr|c)ão would be "macarrão" or "macacão".
//      A dot inside a regex is used to say that "whatever symbol can be here".
//      To strictly say that you really want a textual dot use "\\." instead.
//      Inside a [] you do not need to put double slashes (\\);
//      Search is when you want to find a pattern inside a string.
//      To do that use Pattern and Matcher classes (Pattern.compile(regex),
//      patternObj.matcher(text), matcherObj.find(), matcherObj.start(), matcherObj.group()).
//      Validate is when you want to check a string is strictly fitted in a specific regex.
//      To do that use Pattern.matches(regex, text) or the method matches() every string has.
//      See validator.Validator to see our tests!
        String txt = "cat mat pat bat";
        Pattern pat = Pattern.compile("[^b]at\\s"); //Inside a character set, ^ negates all following characters.
        Matcher mat = pat.matcher(txt);
        while (mat.find())
            System.out.println(mat.start() + " " + mat.group());
        String mrs = "Mr. Robinson, ms jabran, Mrs. Black Panther, Mr John Wayne, Mr. T Andrews, Ms. Marianna, Me Marian, MR.S Jake"; //We want only Mrs.
        mat = (Pattern.compile("Mr\\.?\\s[A-Z]\\w*")).matcher(mrs);
        while (mat.find())
            System.out.println(mat.start() + " " + mat.group());
        mat = (Pattern.compile("M(r|s|rs)\\.?(\\s[A-Z]\\w*)+")).matcher(mrs);
        while (mat.find())
            System.out.println(mat.start() + " " + mat.group());
        String emails = "CoreyMSchafer@gmail.com corey.schafer@university.edu corey-321-schafer@my-work.net";
        String regex = "[\\w.-]+@[\\w-]+(\\.[a-z]+)+";
        pat = Pattern.compile(regex);
        mat = pat.matcher(emails);
        while (mat.find())
            System.out.println(mat.group());

    }
}
