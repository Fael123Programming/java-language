package br.com.rafael.exercises.ex04;

public class TestingSwitchCase {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were passed...");
            System.out.println("The program was finalized");
            System.exit(0);
        }
        try {
            int month = Integer.parseInt(args[0]);
            String monthStr = switch (month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "Invalid month";
            };
            System.out.println(monthStr);
        } catch (NumberFormatException nfe) {
            System.out.println("The first argument must be an integer between 1 and 12 indicating a month of the year");
        }
    }
}
