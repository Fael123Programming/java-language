package br.com.rafael.dates;

import java.text.DateFormat;
import java.util.*; //Locale, Date, Calendar etc.

public class TestDateFormat {
    public static void main(String[] args) {
//      Using a DateFormat you can switch from six different formats to use.
//      A format is a pre-definite appearance to give to your dates.
        DateFormat[] dateFormats = new DateFormat[6];
        dateFormats[0] = DateFormat.getInstance();
        dateFormats[1] = DateFormat.getDateInstance();
        dateFormats[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.FULL);
//        Each of these methods provides a different formatting to a date.
        Calendar calendar = Calendar.getInstance(); //Date today!
        for (DateFormat df : dateFormats)
            System.out.println(df.format(calendar.getTime())); //getTime() returns a Date object from this Calendar object.
        System.out.println("-----------------------------------------------------------------------------");
//      We can use localized date formatting instead of using the system's default (in my case, english-based dates).
//      Locale is used to make personalized currencies too.
        Locale ptBr = new Locale("pt", "BR");
        Locale it = new Locale("it", "IT"); //it stands for italian.
        Locale jp = new Locale("ja", "JP"); //ja stands for japanese.
        Locale in = new Locale("hi", "IN"); //hi stands for hindi.
//      A locale constructor code must be specified by the ISO 639.
        DateFormat ptBrFormat = DateFormat.getDateInstance(DateFormat.FULL, ptBr);
        DateFormat itFormat = DateFormat.getDateInstance(DateFormat.FULL, it);
        DateFormat jpFormat = DateFormat.getDateInstance(DateFormat.FULL, jp);
        DateFormat indianFormat = DateFormat.getDateInstance(DateFormat.FULL, in);
        System.out.println("Date in brazilian portuguese: " + ptBrFormat.format(calendar.getTime()));
        System.out.println("Date in root italian: " + itFormat.format(calendar.getTime()));
        System.out.println("Date in japanese: " + jpFormat.format(calendar.getTime()));
        System.out.println("Date in hindi: " + indianFormat.format(calendar.getTime()));
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(in.getDisplayCountry() + " " + in.getDisplayLanguage());
        System.out.println(jp.getDisplayCountry() + " " + jp.getDisplayLanguage());
        System.out.println("How do I write \"portuguese\" in japanese? ");
        System.out.println(ptBr.getDisplayLanguage(jp));
        System.out.println("And \"Brazil\" in hindi?");
        System.out.println(ptBr.getDisplayCountry(in));
    }
}
