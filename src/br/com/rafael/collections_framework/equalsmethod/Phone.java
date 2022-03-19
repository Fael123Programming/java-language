package br.com.rafael.collections_framework.equalsmethod;

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
     * <li>Transitive: x.equals(y) == true, y.equals(x) == true, x.equals(z) == true, then y.equals(x) == true;</li>
     * <li>Consistent: the method must return the same boolean value always, considering that the objects
     * being compared with did not change.</li>
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
}
