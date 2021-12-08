package br.com.rafael.formatting_numbers_and_currencies;

import java.text.NumberFormat; //Abstract class to format numbers based on a locale.
import java.text.ParseException;
import java.util.*;

public class TestNumberFormat {
    public static void main(String[] args) {
        Locale frLocale = new Locale("fr", "FR");
        Locale brLocale = new Locale("pt", "BR");
        System.out.println(frLocale.getDisplayCountry() + "\t" + frLocale.getDisplayLanguage());
        System.out.println(brLocale.getDisplayCountry() + "\t" + brLocale.getDisplayLanguage());
        float decimalNumber = 1123123123.2343f;
        NumberFormat[] formats = new NumberFormat[4];
        formats[0] = NumberFormat.getInstance();
        formats[1] = NumberFormat.getInstance(frLocale); //Add commas.
        formats[2] = NumberFormat.getCurrencyInstance(); //Add dollar sign ($).
        formats[3] = NumberFormat.getCurrencyInstance(brLocale); //Add real sign (R$).
        for (NumberFormat formatter: formats)
            System.out.println(formatter.format(decimalNumber));
        System.out.println(NumberFormat.getCurrencyInstance(frLocale).format(decimalNumber));
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("ch", "CH")).format(decimalNumber));
        System.out.println(formats[0].getMaximumFractionDigits()); //3
        System.out.println(formats[3].getMaximumFractionDigits());
        formats[0].setMaximumFractionDigits(1);
        formats[3].setMaximumFractionDigits(5);
//        Parse string numbers into numbers themselves.
        String number = "3.14159";
        try {
            Double d = (Double) formats[0].parse(number); //parse() gives an object from class Number.
            System.out.println(formats[3].format(d + 1));
            formats[0].setParseIntegerOnly(true); //It will truncate all casts.
            System.out.println(formats[0].parse("23.123123"));
        } catch (ParseException nfe) {
            System.out.println("Not a valid number");
        }
    }
}
