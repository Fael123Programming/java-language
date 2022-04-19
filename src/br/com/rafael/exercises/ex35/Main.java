package br.com.rafael.exercises.ex35;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        final int STUDENT = 2;
        String[] names = new String[STUDENT], situations = new String[STUDENT];
        double[][] grades = new double[STUDENT][STUDENT];
        int[] averages = new int[STUDENT];
        for (int i = 0; i < STUDENT; i++) {
            names[i] = JOptionPane.showInputDialog("Name of student " + (i + 1));
            grades[i][0] = Double.parseDouble(JOptionPane.showInputDialog("Grade of test 1"));
            grades[i][1] = Double.parseDouble(JOptionPane.showInputDialog("Grade of test 2"));
        }
        for (int i = 0; i < STUDENT; i++) {
            averages[i] = (int) Math.round((grades[i][0] + grades[i][1]) / 2);
        }
        for (int i = 0; i < STUDENT; i++) {
            if (averages[i] < 5) {
                situations[i] = "RP";
            } else {
                situations[i] = "AP";
            }
        }
        for (int j = 0; j < STUDENT; j++) {
            System.out.printf("Student: %-10s \t grade 1: %.1f \t grade 2: %.1f \t average: %d \t situation: %-10s\n", names[j], grades[j][0], grades[j][1], averages[j], situations[j]);
        }
    }
}
