package br.com.rafael.resource_bundles.part2;

//You can create an inheritance tree of resource bundles such that we'll have
//those common messages put in the family base (like messages that do not
//change, no matter the language) and more language-specific messages in
//a proper resource bundle.
//Let us create a family of resource bundles to record exception messages.
//-> Family base: exceptionMessages.properties
//-> Brazilian Portuguese child: exceptionMessages_pt_BR.properties
//-> Traditional French child: exceptionMessages_fr_FR.properties
//-> American English child exceptionMessages_en_US.properties
//When called to afford a family-specific resource bundle, ResourceBundle.getBundle()
//will recursively run through the whole family looking up for this exact bundle.
//If not found, it will try to supply the system's standard bundle then.
//We can override keys from family base resource bundles in children of it.

import java.util.ResourceBundle;
import java.util.Locale;

public class Test2 {
    public static void main(String[] args) {
        final String PATH = "br.com.rafael.resource_bundles.part2.exceptionMessages";
        ResourceBundle exceptionMessagesBundle = ResourceBundle.getBundle(PATH);
//      System's standard locale will be used above.
        printValues(exceptionMessagesBundle);
        System.out.println("----------------------------------------------------");
        ResourceBundle frenchBundle = ResourceBundle.getBundle(PATH, new Locale("fr", "FR"));
        printValues(frenchBundle);
        System.out.println("----------------------------------------------------");
        ResourceBundle brazilianBundle = ResourceBundle.getBundle(PATH, new Locale("pt", "BR"));
        printValues(brazilianBundle);
        System.out.println("----------------------------------------------------");
        System.out.println(frenchBundle.getString("incorrectUserName"));
        ResourceBundle chineseBundle = ResourceBundle.getBundle(PATH, new Locale("ch", "CH"));
//      There is no resource bundle to this language. Then, system's standard will be given.
        System.out.println("----------------------------------------------------");
        printValues(chineseBundle); //en_US resource bundle.
    }

    private static void printValues(ResourceBundle aBundle) {
        for (String key : aBundle.keySet())
            System.out.println(aBundle.getString(key));
    }
}
