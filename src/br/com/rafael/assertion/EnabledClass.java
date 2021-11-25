package br.com.rafael.assertion;

public class EnabledClass {
    public void checkAssertion(){
        assert (false) : "If the condition within parentheses is false, an assertion gets thrown";
    }
}
