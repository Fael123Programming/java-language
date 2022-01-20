package br.com.rafael.exercises.ex11;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        short quantityOfStudents = 0;
        try {
            quantityOfStudents = Short.parseShort(JOptionPane.showInputDialog(null,
                    "Quantity of Students: ", "Record System", JOptionPane.QUESTION_MESSAGE));
        } catch(NumberFormatException ignore) {
            JOptionPane.showMessageDialog(null, "Invalid quantity of students", "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (quantityOfStudents < 0)
            JOptionPane.showMessageDialog(null, "Invalid quantity of students", "Error",
                JOptionPane.ERROR_MESSAGE);
        else if (quantityOfStudents == 0)
            JOptionPane.showMessageDialog(null, "No students to record", "System Report",
                    JOptionPane.INFORMATION_MESSAGE);
        else {
            String[] students = new String[quantityOfStudents];
            byte[] ages = new byte[quantityOfStudents];
            for (short i = 0; i < quantityOfStudents; i++) {
                students[i] = JOptionPane.showInputDialog(null, "Student " + (i + 1) + "\nName",
                        "Record System", JOptionPane.QUESTION_MESSAGE);
                if (students[i].isBlank()) {
                    JOptionPane.showMessageDialog(null, "Invalid student name!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    i--;
                    continue;
                }
                try {
                    ages[i] = Byte.parseByte(JOptionPane.showInputDialog(null,
                            "Student " + (i + 1) + "\nAge", "Record System", JOptionPane.QUESTION_MESSAGE));
                } catch(NumberFormatException ignore) {
                    JOptionPane.showMessageDialog(null, "Invalid age", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    i--;
                    continue;
                }
                if (ages[i] <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid age", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    i--;
                }
            }
            short sizeLargestName = (short) students[0].length();
            for (short i = 1; i < quantityOfStudents; i++)
                if (students[i].length() > sizeLargestName)
                    sizeLargestName = (short) students[i].length();
            StringBuilder finalReport = new StringBuilder(), header = new StringBuilder(
                    String.format("%-" + sizeLargestName + "s   Age", "Student"));
            finalReport.append("-".repeat(header.length() + 5)).append("\n");
            finalReport.append(header).append("\n");
            finalReport.append("-".repeat(header.length() + 5)).append("\n");
            for (short i = 0; i < quantityOfStudents; i++)
                finalReport.append(String.format("%-" + sizeLargestName + "s   %d", students[i], ages[i])).append("\n");
            finalReport.append("-".repeat(header.length() + 5));
            System.out.println(finalReport);
        }
    }
}
