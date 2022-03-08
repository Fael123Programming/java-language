package br.com.rafael.exercises.ex22;

public class Main {
    public static void main(String[] args) {
        long bigNumber = +1000000001231231L;
        System.out.println(bigNumber);
        System.out.println(-(-1));
        Parent parent = new Parent();
        Parent child = new Child();
        SampleInterface anotherChild = new Child();
        System.out.println(parent instanceof Parent);
        System.out.println(child instanceof Parent);
        System.out.println(child instanceof Child);
        System.out.println(anotherChild instanceof SampleInterface);
        System.out.println(null instanceof Object); //null is fatherless or an orphan type.
    }
}
