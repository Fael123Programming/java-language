package br.com.rafael.regex;

import java.util.regex.*;

public class TestQuantifiers2 {
    public static void main(String[] args) {
//        Searching a specific pattern in strings.
        StringBuilder emails = new StringBuilder();
        emails.append("josh.eduards@gmail.com ");
        emails.append("mk_clin@hightech.io ");
        emails.append("$21*(@hotmail.com ");  //Invalid email!
        emails.append("rafael.fonseca@ifgoiano.edu.br ");
        String regex = "[\\w.-]+@[a-zA-Z-]+(\\.[a-z]+)+";
//        [] means this is a range of elements (character set);
//        () groups all elements (useful to define a unique quantifier to multiple items);
//        "a-z", "A-Z" and "0-9" means alphanumeric characters are allowed;
//        "\\." means a dot is also, allowed;
//        "_-" means both these characters are allowed;
//        As dot is a special character to regular expressions, it must be preceded of \\ if not used inside a [].
//        "+" means "at least one of these" or "one or more";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(emails);
        while (mat.find())
            System.out.println(mat.start() + " " + mat.group());
        System.out.println();
        StringBuilder urls = new StringBuilder();
        urls.append("https://www.google.com ");
        urls.append("http://coreyms.com ");
        urls.append("https://music.youtube.com ");
        urls.append("https://www.ifgoiano.edu.br ");
        urls.append("https://images.google.com ");
        urls.append("https://www.nasa.gov ");
//      We want to get everything that stands for top-level domain.
        regex = "https?://(\\w+)(\\.\\w+)+"; //Regex to match urls with multiple (recursive) subdomains.
//        regex = "https?://(www\\.)?\\w+\\.\\w+";
        pat = Pattern.compile(regex);
        mat = pat.matcher(urls);
        System.out.println("mat.group(1)\t\tmat.group(2)");
        while (mat.find())
            System.out.println(mat.group(1).trim() + "\t\t\t\t\t" + mat.group(2).trim());
//        Groups are based on the metacharacter "()".

    }
}
