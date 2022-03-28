package br.com.rafael.interfaces.ex05;

// If you do not specify that the interface is public, then your interface is
// accessible only to classes defined in the same package as the interface (package-private).
// whereas a class can extend only one other class (single inheritance), an interface can extend any number
// of interfaces. The interface declaration includes a comma-separated list of all the interfaces that it extends.
// Your class can implement more than one interface, so the "implements" keyword is followed by a comma-separated
// list of the interfaces implemented by the class.
// By convention, the "implements" clause follows the "extends" clause, if there is one.

interface GroupedInterface extends Interface1, Interface2, Interface3 {

    public static final double E = 2.718282;
    public static final double PI = 3.141592;

    public abstract void doSomething(int i, double x);

    public abstract int doSomethingElse(String str);
}
