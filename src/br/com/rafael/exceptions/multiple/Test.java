package br.com.rafael.exceptions.multiple;

public class Test {
    public static void main(String[] args) {
//        If you have to put multiple catches sequentially, never put an exception super class
//        before a more specific exception class.
        try { //Nested catches until Java 6
            throw new ArithmeticException(ArithmeticException.class.toString());
        } /*catch(Exception e) {
            Error because Exception is a hierarchy-top class.
        } */catch(ArrayIndexOutOfBoundsException aiobe) {
            System.out.println(aiobe.getMessage());
        } catch(IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch(NullPointerException npe) {
            System.out.println(npe.getMessage());
        } catch(ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

        try { //Nested catches: Java 7
            throw new NullPointerException(NullPointerException.class.toString());
        } catch(ArrayIndexOutOfBoundsException | NullPointerException exc) { //'|' is called pipe operator.
            if (exc.getClass().equals(ArrayIndexOutOfBoundsException.class))
                System.out.println("Exception 1");
            else
                System.out.println("Exception 2");
            System.out.println(exc.getMessage());
        }
//        Do not put super and child exception classes together.
    }
}
