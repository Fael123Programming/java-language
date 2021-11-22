package br.com.rafael.exceptions;

import br.com.rafael.exceptions.checked.CheckedException;
import br.com.rafael.exceptions.unchecked.UncheckedException;

public class Main {
    private static long RECURSION_TIMES = 0;
    public static void main(String[] args) {
//        stackOverflow(1024);
        try {

        } catch(Exception e) {
            //Using a reference variable of a more general class here does not require
            //a code which may throw an exception inside try block.
            //Notwithstanding, if you specify a more specialized class there must be
            //that code.
        }
        try {

        } catch(Error e) {

        }

        try {

        } catch(RuntimeException re) {

        }
        try {

        } catch(OutOfMemoryError ome) {

        }
        try {
            go();
        } catch(StackOverflowError soe) {
            System.out.println("Maximum recursion times is " + RECURSION_TIMES);
        }
//        try { Here we have a problem: no code capable of throwing an IOException was provided inside the try block.
//             See that this exception is more specific!
//        } catch(IOException ioe) {
//
//        }
        try { //try/catch is obliged with checked exceptions!
            CheckedException exc = new CheckedException();
            throw exc;
        } catch(CheckedException ce) {
            System.out.println(ce.getMessage());
        }
        UncheckedException ue = new UncheckedException();
        throw ue; //try/catch is not obliged with unchecked exceptions!
//        There are two ways of handling an exception: rethrowing it ("throws" at method signature) or treating it
//        using try/catch.
    }

    private static void stackOverflow(double number) {
//        This method will cause a StackOverflowError.
//        This error inherits from VirtualMachineError:
//        errors that indicate your JVM broke or
//        has run out of resources.
        System.out.println(number / 2);
        stackOverflow(number / 2.0);
    }

    private static void go() {
        RECURSION_TIMES++;
        go();
    }
}
