package br.com.rafael.nested_classes.local_classes;

//Local classes are classes that are defined in a block, which is a group of zero or more statements between balanced
//braces. You typically find local classes defined in the body of a method, but it can be found inside loop blocks
//(like for, while, etc.) and conditional blocks  (like if-then-else). They cannot be static.

import java.util.Random;

public class LocalClassExample {
    private final static String REGEX = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
        final int numberLength = 10;

        interface Callable {
            String getPhoneNumber();
        }

        class PhoneNumber implements Callable {
            final String formattedPhoneNumber;
            public static final int RANDOM_VALUE;

            static {
                RANDOM_VALUE = new Random().nextInt(1001);
            }

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(REGEX, "");
                formattedPhoneNumber = currentNumber.length() == numberLength ? currentNumber : null;
            }

            @Override
            public String getPhoneNumber() {
                return formattedPhoneNumber;
            }

            public void printOriginalNumbers() {
                System.out.println("Original numbers are " + phoneNumber1 + " and " + phoneNumber2);
            }
        }
        System.out.println(PhoneNumber.RANDOM_VALUE);
        PhoneNumber phone1 = new PhoneNumber(phoneNumber1), phone2 = new PhoneNumber(phoneNumber2);
        phone1.printOriginalNumbers();
        String phone1Str, phone2Str;
        if ((phone1Str = phone1.getPhoneNumber()) == null)
            System.out.println("Invalid first number");
        else
            System.out.println("First number is " + phone1Str);
        if ((phone2Str = phone2.getPhoneNumber()) == null)
            System.out.println("Invalid second number");
        else
            System.out.println("Second number is " + phone2Str);
    }

    public static void main(String[] args) {
        validatePhoneNumber("123-456-7890", "456-7890");
        String number = "(64) 99312-4464";
        System.out.println(number.replaceAll("[^0-9]", ""));
    }
}
