package br.com.rafael.interfaces.ex06;

public interface Relatable {

    /**
     * <p>Compares two objects of the same class checking
     * whether they are equal or not in size.</p>
     * @param other the other object to compare with
     * @return 1, 0 or -1 if this object is greater than, equal to or less than the object other, respectively.
     */
    public abstract int isLargerThan(Relatable other);
}
