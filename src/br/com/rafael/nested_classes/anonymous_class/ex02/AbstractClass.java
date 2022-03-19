package br.com.rafael.nested_classes.anonymous_class.ex02;

public abstract class AbstractClass {
    private final int a, b, c;

    public AbstractClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract void printVars();

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
