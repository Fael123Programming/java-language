package br.com.rafael.interfaces.ex07;

public interface DoIt {
    public abstract void doSomething(int i, double x);

    public abstract int doSomethingElse(String str);

//    public default boolean didItWork(int i, double x, String str) {
//        return i + x < str.length();
//    }
}
