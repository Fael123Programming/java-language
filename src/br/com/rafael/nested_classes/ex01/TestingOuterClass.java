package br.com.rafael.nested_classes.ex01;

import br.com.rafael.nested_classes.ex01.OuterClass.StaticNestedClasses;

public class TestingOuterClass {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        System.out.println(outerObject.outerField);
        System.out.println(innerObject.innerField);
        System.out.println("----------------------------------------------------------");
        StaticNestedClasses staticNestedObject = new StaticNestedClasses();
        staticNestedObject.staticNestedClassField = 200;
        System.out.println(staticNestedObject.staticNestedClassField);
    }
}
