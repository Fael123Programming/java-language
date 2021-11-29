package br.com.rafael.debugging;

public class TestDebugging {
    public static void main(String[] args) {
//        Those red-marked lines are called breakpoints.
//        When debugging, the execution flow will pass through these lines
//        slowly showing all variables and details of each one.
//        You need to run your program in Debug Perspective instead of
//        traditional executing.
//        Step into: before a function (or method) call, the execution flow will enter the function
//        going through all its lines.
//        Step over: it does the opposite. Instead of going into it, it skips it so the next line after
//        the function call will be analyzed.
//        Force Step Into: if you are using native methods from Java, it goes inside into these methods.
//        Step Out: makes that the flow gets out of the current method being currently analyzed.
        double value = 100;
        if ((value / 2 * 4 - 5) % 2 == 1) {
            for (int i = 0; i < 10; i++)
                System.out.println("Inside if");
            aMethod(value);
        } else {
            value += (89 - 23 + 15) / 2.0;
            if (value % 2 == 0)
                for (int i = 0; i < 10; i++)
                    System.out.println("Inside else if");
            else
                System.out.println("Inside else else");
        }
    }

    private static void aMethod(double value) {
        System.out.println("Value is worth " + value);
        if (value % 2 == 0)
            System.out.println("It is even");
        else
            System.out.println("It is odd");
        anotherMethod(value);
    }

    private static void anotherMethod(double value) {
        int divisors = 0;
        for (int i = 1; i <= (int) Math.sqrt(value); i++)
            if (value % i == 0)
                divisors++;
        if (divisors == 2)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }
}
