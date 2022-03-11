package br.com.rafael.exercises.ex25;

public class Main {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++)
            System.out.println("i=" + i);
//      First, the initialization block is executed (only once at all);
//      Second, the logic condition that controls the loop is checked:
//      -> If it is true, then the body of the loop is executed;
//      -> Else it even does not start.
//      Third, after the body has been executed the increment/decrement is performed.
//      This routine is done again and again til the loop gets broken.
        System.out.println("Outside loop: i=" + i);
        for (; ; )
            System.out.println("Infinite loop");
    }
}
