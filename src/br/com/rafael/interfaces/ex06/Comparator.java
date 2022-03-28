package br.com.rafael.interfaces.ex06;

// These methods work for any "relatable" objects, no matter what their class inheritance is. When they implement
// Relatable, they can be of both their own class (or superclass) type and a Relatable type. This gives them
// some advantages of multiple inheritance, where they can have behavior from both a superclass and an interface.

public class Comparator {
    public static Object findLargest(Object obj1, Object obj2) throws IllegalArgumentException {
        checkArguments(obj1, obj2);
        Relatable r1 = (Relatable) obj1, r2 = (Relatable) obj2;
        if (r1.isLargerThan(r2) > 0)
            return obj1;
        else
            return obj2; //Either obj1 and obj2 have same size or obj2 is greater than obj1.
    }

    public static Object findSmallest(Object obj1, Object obj2) throws IllegalArgumentException {
        checkArguments(obj1, obj2);
        Relatable r1 = (Relatable) obj1, r2 = (Relatable) obj2;
        if (r1.isLargerThan(r2) < 0)
            return r1;
        else
            return r2; //Either obj1 and obj2 are of the same size or obj2 is less than obj1.
    }

    public static boolean isEqual(Object obj1, Object obj2) throws IllegalArgumentException {
        checkArguments(obj1, obj2);
        Relatable r1 = (Relatable) obj1, r2 = (Relatable) obj2;
        return r1.isLargerThan(r2) == 0;
    }

    private static void checkArguments(Object obj1, Object obj2) throws IllegalArgumentException {
        if (!(obj1 instanceof Relatable) || !(obj2 instanceof Relatable))
            throw new IllegalArgumentException("all objects passed in as arguments must be Relatable");
    }
}
