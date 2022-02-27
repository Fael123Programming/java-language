package br.com.rafael.graphical_interfaces.ex06.numberchecker;

public class NumberChecker {
    public static boolean isInvalidNumber(String strNumber) {
        if (strNumber.isBlank())
            return true;
        for (char ch : strNumber.toCharArray())
            if (!Character.isDigit(ch) && ch != '.')
                return true;
        return false;
    }
}
