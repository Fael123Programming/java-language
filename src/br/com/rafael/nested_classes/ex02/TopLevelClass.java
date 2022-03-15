package br.com.rafael.nested_classes.ex02;

public class TopLevelClass {
    void accessMembers(OuterClass outerObject) {
//        System.out.println(OuterClass.outerField); -> Compiler error!
        System.out.println(outerObject.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
