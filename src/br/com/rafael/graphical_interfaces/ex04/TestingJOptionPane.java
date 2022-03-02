package br.com.rafael.graphical_interfaces.ex04;

import javax.swing.*;

public class TestingJOptionPane {
    public static void main(String[] args) {
    //Show a normal message
        ImageIcon ic = new ImageIcon("/home/leafar/documents/prg/code/java/java-language/src/br/com/rafael/graphical_interfaces/createfile/git_logo.png");
        JOptionPane.showMessageDialog(null, "Hello Java!", "Greetings", JOptionPane.INFORMATION_MESSAGE, ic);
    //Confirm message: besides it shows a message, it returns an integer value according to which option user has chosen.
    //Yes=0, no=1, cancel=2.
        int answer = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Continuation dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        String answerStr = answer == 0 ? "You have chosen to proceed!" : "Dismissed";
        JOptionPane.showMessageDialog(null, answerStr, "Continuation Dialog", JOptionPane.INFORMATION_MESSAGE);
    //Input message: it prompts the user for input data to be entered.
        String name = JOptionPane.showInputDialog(null, "What is your full name?", "Name", JOptionPane.QUESTION_MESSAGE);
    //If nothing is given then null is returned!
        answer = JOptionPane.showConfirmDialog(null, "Is " + name + " your name, indeed?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (answer == 0)
            System.out.println("Okay");
        else
            System.out.println("Not okay");
    //Option dialog
        String[] countries = {"Germany", "Brazil", "France"};
        answer = JOptionPane.showOptionDialog(null, "What country is yours?", "Countries", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, countries, countries[0]);
        answerStr = switch(answer) {
            case 0 -> "Germany";
            case 1 -> "Brazil";
            case 2 -> "France";
            default -> "unknown";
        };
        System.out.println("Your country is " + answerStr) ;
    }
}
