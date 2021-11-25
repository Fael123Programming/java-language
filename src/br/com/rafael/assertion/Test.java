package br.com.rafael.assertion;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Assertion is used when you want to tell the program what value some stuff should be
//        evaluated as and if that is not true, there will be thrown an Error.
//        Assertions should be used only internally in the system when it is being developed
//        mostly in private methods. You can avoid errors and future debugging.
//        By default, the resource of assertions is turned off, so to get it working you need to go to:
//        Run -> Edit Configurations -> Modify Options -> Add VM Options -> Insert into the field: -ea (enable assertion).
        Scanner input = new Scanner(System.in);
        int value = 0;
        while(value < 20) {
            value = input.nextInt();
            assert (value > 0); //If value <= 0, there will be thrown an AssertionError.
//           It is quite a bad practice to handle this error because this feature is only when testing
//           your system, but you can do that.
//           Assertions are not used in production code.
        }
        assert (value != 100) : "You can add more information right over here or even call a fruitful method";
        assert (value != 200) : true;
        assert (value != 300) : 123123123;
        //assert (1 > 5) : Math.random();
//        To disable this feature: instead of -ea, put into it -da (disable assertion) or just blot it out.
//        You can go further and specify JVM which class to enable assertions: into that box type:
//        "-ea:" + complete path to that class (without extension though).
//        You can use the pattern "-ea:" + class path and "-da:" + class path separated by blank spaces
//        to set solely which class to enable or disable assertions.
        (new EnabledClass()).checkAssertion();
    }

    public void daysOfWeek(int day) {
        switch(day) {
            case 1, 2, 3, 4, 5, 6,7 -> {/* do some stuff*/ }
            default -> {
                assert false : "Invalid day of the week";
            }
        }
    }
}
