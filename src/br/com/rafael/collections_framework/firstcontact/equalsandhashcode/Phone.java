package br.com.rafael.collections_framework.firstcontact.equalsandhashcode;

import java.util.Objects;

public class Phone {
    private final String name, IMEI;

    public Phone(String name, String IMEI) {
        this.name = name;
        this.IMEI = IMEI;
    }

    public String getName() {
        return name;
    }

    public String getIMEI() {
        return IMEI;
    }

    /**
     * <p>Compares the current object with the object passed as argument (real parameter).</p>
     *<p>This method must be (consider x, y and z non-null objects):</p>
     * <ul>
     * <li>Reflexive: x.equals(x) == true;</li>
     * <li>Symmetric: x.equals(y) == true, then y.equals(x) == true;</li>
     * <li>Transitive: x.equals(y) == true, y.equals(x) == true, x.equals(z) == true, then y.equals(z) == true;</li>
     * <li>Consistent: the method must return the same boolean value always, considering that the objects
     * being compared did not change.</li>
     * </ul>
     * @param anotherObject the object to compare with
     * @return true if this object and anotherObject are equal. false instead.
     */
    @Override
    public boolean equals(Object anotherObject) {
        if (!(anotherObject instanceof Phone casted)) //null is being caught too.
            return false;
        if (this == casted) //x.equals(x) case. It must be reflexive!
            return true;
        return IMEI != null && IMEI.equals(casted.IMEI);
    }

    @Override
    public int hashCode() {
//      Generates a hash code for any object of this class.
//      "native" stands for a piece of code that its implementation
//      is made depending on the operating system.
//      One obligation is that:
//        -> Let x and y be two objects, if x.equals(y) then x.hashCode() must
//        be equal to y.hashCode().
//      The opposite shouldn't be necessarily true because collision between
//      hash codes may occur.
//      If x.hashCode() != y.hashCode() then x.equals(y) must be false.
        return IMEI == null ? -1 : Objects.hash(IMEI); //or IMEI.hashCode();
    }

    @Override
    public String toString() {
        return name + " (" + IMEI + ")";
    }
}
