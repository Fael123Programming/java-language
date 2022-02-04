package br.com.rafael.interfaces.ex01.interfaces_themselves;

import java.math.BigDecimal;

//All methods of an interface are by definition: public and abstract (no method body for them).
//A 'default' method is a pre-defined method in case this interface implementors did not provide
//an implementation for it. It can be overridden by its implementors.
//We can also have private (never use protected, by the way) and static methods here.
//All attributes are by definition: public, static and final.
//Default, private and static methods must have block body!

public interface Taxable {
    BigDecimal FEDERAL_TAX = new BigDecimal("0.0918"), STATE_TAX = new BigDecimal("0.0823"), CITY_TAX =
            new BigDecimal("0.0123"); //public, static and final attributes, by definition!

    default String getTaxes() {
        this.doNothing();
        Taxable.anotherDoNothing();
        return "Federal tax: " + FEDERAL_TAX + "\nState tax: " + STATE_TAX + "\nCity tax: " +
                CITY_TAX;
    }

    BigDecimal calculateTaxesOverPrice(); //public and abstract methods!

    BigDecimal calculateTaxedPrice();

    private void doNothing() {
        //Yes... it does nothing!!!
        //Accessed only through inside the interface.
    }

    static void anotherDoNothing() {
        //Pretty what you just read on this method signature...
    }
}
