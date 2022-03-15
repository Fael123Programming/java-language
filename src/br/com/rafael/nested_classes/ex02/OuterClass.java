package br.com.rafael.nested_classes.ex02;

public class OuterClass {
    String outerField;
    static String staticOuterField;

    static {
        staticOuterField = "Static outer field";
    }

    {
        outerField = "Outer field";
    }

    class InnerClass {
        void accessMembers () {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void accessMembers (OuterClass outerClassObject) {
//            System.out.println(outerField);
//            The code above would cause a compiler error because you
//            cannot access a non-static field from a static context.
            System.out.println(outerClassObject.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String... args) {
        System.out.println("Inner Class");
        System.out.println("--------------------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();
        System.out.println("\nStatic nested class");
        System.out.println("--------------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);
        System.out.println("\nTop-level class");
        System.out.println("--------------------------");
        TopLevelClass topObject = new TopLevelClass();
        topObject.accessMembers(outerObject);
    }
}
