package br.com.rafael.exceptions.programmer_exceptions;

import javax.swing.JOptionPane;

public class TestException {
    public static void main(String[] args) {
        String user = JOptionPane.showInputDialog("Enter user nickname");
        String password = JOptionPane.showInputDialog("Enter user password");
        try {
            if(login(user, password))
                System.out.println("User logged in");
        } catch (InvalidLoginCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean login(String user, String password)  throws InvalidLoginCredentialsException {
        String dataBasePassword = getPasswordOfThisUser(user);
        if (dataBasePassword.equals(password))
            return true; //User in!
        throw new InvalidLoginCredentialsException("Incorrect password");
    }

    private static String getPasswordOfThisUser(String user) throws InvalidLoginCredentialsException {
        if (nonexistentUser(user))
            throw new InvalidLoginCredentialsException("User not found");
        return "11111"; //Just a super trivial example...
    }

    private static boolean nonexistentUser(String user) {
        return !user.equals("rafael");
    }
}
