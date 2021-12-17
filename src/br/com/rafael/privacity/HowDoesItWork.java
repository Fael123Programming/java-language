package br.com.rafael.privacity;
/**
 * For attributes in a class:
 * -> public: accessible anywhere through an object and the dot (".") operator;
 * -> protected: accessible by any class at the same package or any child of the class located elsewhere;
 * -> package-private: accessible by any class at the same package or any child of the class only in the same package;
 * -> private: accessible only inside class;
 * See that all types include this last one: all attributes are visible at least inside their own class.
 * For classes, access modifiers work a little different.
 * Outer classes may be:
 * -> public: accessible anywhere; or
 * -> package-private: accessible only in the package where they are;
 * Outer classes cannot be private or protected!!!
 * Inner classes may be:
 * -> public: accessible anywhere;
 * -> protected: accessible in the class where they are defined, in the package where their outer classes
 * are defined or whatever child of their outer classes in whatever package (same or different);
 * -> package-private: accessible in the class where they are defined, in the package where their outer
 * classes are defined or whatever child of their outer classes in the same package;
 * -> private: accessible only in their outer classes.
 */
public class HowDoesItWork {
    public static void main(String[] args) {
        System.out.println("Java and O.O languages have complex package mechanisms to organize a project");
    }
}
