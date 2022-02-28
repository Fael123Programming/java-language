package br.com.rafael.io.classconsole;

import java.io.Console; //Check its documentation for clarifications.

public class Test {
    public static void main(String[] args) {
//      Run this code outside an IDE!!!
        Console console = System.console(); //That's the only way of getting a Console instance.
//      System.out.println(console); -> If it is run in IntelliJ it will be null.
//      As we are bound by IntelliJ, JVM does not have a console.
//      It is launched by a background job scheduler.
        char[] password = console.readPassword("%s", "Password: ");
        char[] checkedPassword = {1, 2, 3, 4, 5, 'J', 'a', 'v', 'a'};
        StringBuilder builder = new StringBuilder("Access ");
        if (validPassword(password, checkedPassword))
            builder.append("allowed");
        else
            builder.append("denied");
        console.format("%s\n", builder);
    }

    private static boolean validPassword(char[] typedPassword, char[] realPassword) {
        if (typedPassword.length != realPassword.length)
            return false;
        for (int i = 0; i < typedPassword.length; i++)
            if (typedPassword[i] != realPassword[i])
                return false;
        return true;
    }
}
