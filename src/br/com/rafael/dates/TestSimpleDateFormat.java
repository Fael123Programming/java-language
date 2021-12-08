package br.com.rafael.dates;

import java.text.SimpleDateFormat; //Concrete class to format dates based on a pattern into strings.
import java.util.*;

public class TestSimpleDateFormat {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mask = "'Piracanjuba \n'EEEE, d MMMM yyyy HH:mm:ss Z";
        SimpleDateFormat formatter = new SimpleDateFormat(mask, new Locale("pt", "BR"));
        System.out.println(formatter.format(c.getTime()));
        System.out.println(new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss Z", new Locale("fr",
                "FR")).format(c.getTime()));
    }
}
