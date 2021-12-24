package br.com.rafael.resource_bundles.part1;

//How can we internationalize our system putting it
//accessible through any language?
//-> You must create files that have all messages used in
//your system in each language to be translated to;
//-> These files are called as resource bundles;
//-> The pattern to create one is: <family-name>_<language-abbreviation>_<country-abbreviation>.properties
//Example of a resource bundle: messages_en_US.properties
//Where 'properties' is the extension name
//'messages' is just a family of resource bundles!
//You can create several families of them like one to treat exception messages.
//Example: exceptionMessages_fr_FR.properties

import java.util.Locale;
import java.util.ResourceBundle;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //To get this machine's current locale.
//      Use the class ResourceBundle to get access to a resource bundle of your wish.
        ResourceBundle enUSBundle = ResourceBundle.getBundle("br.com.rafael.resource_bundles.part1.messages",
                new Locale("en", "US"));
//      Getting the resource bundle messages_en_US.properties!
//      'baseName' refers to the string before the first underscore.
//       As second parameter, insert a locale object that refers to the location you have set your resource bundle to.
        System.out.println(enUSBundle.getString("mainHeaderMessage"));
//      Use getString() to get the string values of keys put in your resource bundle.
        System.out.println(enUSBundle.getString("exitMessage"));
        System.out.println("-------------------------------------------------");
        printValues(enUSBundle);
        System.out.println(enUSBundle.keySet());
        System.out.println(enUSBundle.getLocale());
        System.out.println("-------------------------------------------------");
        ResourceBundle ptBRBundle = ResourceBundle.getBundle("br.com.rafael.resource_bundles.part1.messages",
                new Locale("pt", "BR"));
        printValues(ptBRBundle);
        System.out.println("-------------------------------------------------");
        System.out.println(ptBRBundle.keySet());
        System.out.println(ptBRBundle.getLocale());
    }

    private static void printValues(ResourceBundle aBundle) {
        aBundle.keySet().forEach(key -> System.out.println(aBundle.getString(key)));
    }
}
