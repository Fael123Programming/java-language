package br.com.rafael.nested_classes;

public class OuterClass {
    class InnerClass { //Non-static nested classes are called as inner classes.
//        Non-static nested classes (inner classes) have access to other members
//        of the enclosing class, even if they are declared private
    }

    static class StaticNestedClasses {
//        Static nested classes do not have access to other members of the enclosing class.
//        As a member of the OuterClass, a nested class can be declared private, public,
//        protected, or package private
    }
}
