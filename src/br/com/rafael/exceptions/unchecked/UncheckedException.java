package br.com.rafael.exceptions.unchecked;

public class UncheckedException extends RuntimeException {
//    Unchecked exceptions are commonly problems caused
//    by programmer such as logic and related stuff.
//    They are not obliged of being treated.

    public UncheckedException(){
        super("CheckedException: unchecked");
    }
}
