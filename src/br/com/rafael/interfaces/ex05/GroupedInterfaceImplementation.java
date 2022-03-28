package br.com.rafael.interfaces.ex05;

public class GroupedInterfaceImplementation extends ClassToInheritFrom implements GroupedInterface {

    @Override
    public void doSomething (int i, double x) {
        System.out.println("You have entered: i=" + i + ", x=" + x);
    }

    @Override
    public int doSomethingElse (String str) {
        return (int) (str.length() + GroupedInterface.E + GroupedInterface.PI);
    }
}
