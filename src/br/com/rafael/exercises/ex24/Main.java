package br.com.rafael.exercises.ex24;

public class Main {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Give me only a year and a month number...");
			return;
		}
		short args0 = 0, args1 = 0;
		boolean invalidInput = false;
		try {
			args0 = Short.parseShort(args[0]);
		} catch(NumberFormatException ignore) {
			System.err.println(args[0] + " seems to be incorrect...");
			invalidInput = true;
		}	
		try {
			args1 = Short.parseShort(args[1]);
		} catch(NumberFormatException ignore) {
			System.err.println(args[1] + " seems to be incorrect...");
			if (!invalidInput) 
				invalidInput = true;
		}
		if (invalidInput)
			return;
		if (args0 <= 0 || args1 <= 0) {
			System.err.println("Cannot handle negative or null values...");
			return;
		}
		if (args0 > 12 && args1 > 12) {
			System.err.println("Cannot infer which represents the month number...");
			return;
		}
		String month;
		byte days;
		short actualYear;
		if (args0 < 13) { 
			//args0 represents the month number...
			//args1 represents the year...
			month = getMonthName(args0);
			days = getDays(args0, args1);
			actualYear = args1;
		} else {
			//args1 represents the month number...
			//args0 represents the year...
			month = getMonthName(args1);
			days = getDays(args1, args0);
			actualYear = args0;
		}	
		System.out.println(month + " of year " + actualYear + " has " + days + " days.");
	}

	private static String getMonthName(short monthNumber) {
		return switch(monthNumber) {
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
			default -> "Invalid month number";
		};
	}

	private static byte getDays(short monthNumber, short year) {
		byte days;
		switch(monthNumber) {
			case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
			case 4, 6, 9, 11 -> days = 30;
			case 2 -> {
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					days = 29;
				else
					days = 28;		
			}
			default -> days = -1;
		}
		return days;
	}
}
