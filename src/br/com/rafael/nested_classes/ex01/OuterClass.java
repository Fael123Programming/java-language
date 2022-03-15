package br.com.rafael.nested_classes.ex01;

public class OuterClass {
//        As a member of the OuterClass, a nested class can be declared private, public,
//        protected, or package private.
//        Serialization of inner classes, including local and anonymous classes, is strongly discouraged.
    public int outerField;

     class InnerClass { //Non-static nested classes are called as inner classes.
//        Non-static nested classes (inner classes) have access to other members of the enclosing class, even if they
//        are declared private. As with instance methods and variables, an inner class is associated with an instance
//        of its enclosing class and has direct access to that object's methods and fields. Also, because an inner
//        class is associated with an instance, it cannot define any static members itself. Objects that are instances
//        of an inner class exist within an instance of the outer class.
//        An instance of InnerClass can exist only within an instance of OuterClass and has direct access to the
//        methods and fields of its enclosing instance.
//        Inner classes may be local (declared inside a method) and anonymous (declared and instantiated only once
//        not having a name for it) also.

        public int innerField;

        public InnerClass() {
            innerField = outerField + 10;
//          Accessing the attribute of its enclosing object.
        }
    }

    static class StaticNestedClasses {
//        Static nested classes do not have access to other members of the enclosing class.
//        As with class methods and variables, a static nested class is associated with its outer class. And like
//        static class methods, a static nested class cannot refer directly to instance variables or methods defined
//        in its enclosing class: it can use them only through an object reference.
//        In effect, a static nested class is behaviorally a top-level class that has been nested in another top-level
//        class for packaging convenience.
        public int staticNestedClassField;
    }
}
