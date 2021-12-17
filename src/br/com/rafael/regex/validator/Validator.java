package br.com.rafael.regex.validator;

import java.util.regex.Pattern;

public class Validator {
    public static boolean isAValidEmail(String email) {
//        The method matches() from class String and class Pattern checks whether a string
//        is right regarding a regular expression.
        return email.matches("[\\w.-]+@[\\w-]+(\\.[a-z]+)+");
    }

    public static boolean isAValidJavaHexadecimalNumber(String hexNumber) {
        return Pattern.matches("0[xX][0-9a-fA-F]+", hexNumber);
//        The same of: return hexNumber.matches("0[xX]([0-9a-fA-F])+");
    }

    public static boolean isAnIntegerNumber(String integer) {
        return Pattern.matches("-?[0-9]+", integer);
    }

    public static boolean isAFloatingPointNumber(String number) {
        return Pattern.matches("-?[0-9]+\\.[0-9]+", number);
    }

    public static boolean isAValidDate(String date) {
        return date.matches("\\d{1,2}/\\d{1,2}/\\d{2,4}");
//      "{m,n}" indicates the range that a specific item should appear.
    }
}
