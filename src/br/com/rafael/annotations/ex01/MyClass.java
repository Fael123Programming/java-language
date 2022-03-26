package br.com.rafael.annotations.ex01;

import java.lang.annotation.Documented;

@ClassPreamble(
        author = "Rafael Fonseca",
        date = "03-22-2022",
        currentRevision = 3,
        lastModified = "03-22-2022",
        lastModifiedBy = "Rafael Fonseca",
        reviewers = {"Josh Block", "John Dee"}
)

//The predefined annotation types defined in java.lang are @Deprecated, @Override, and @SuppressWarnings.

public class MyClass {
    @NonNull int integer;

    @NonNull String string;

    public MyClass(@NonNull int integer, @NonNull String string) {
        this.integer = integer;
        this.string = string;
    }
    /**
     * @deprecated
     * This method was deprecated because ...
     */
    @Deprecated
    public void doSomething() {

    }

    /**
     * @deprecated
     * This method was deprecated because...
     * It should not be used.
     * @return an integer value
     */
    @Deprecated (
            since = "2022-03-26",
            forRemoval = true
    )
    public int returnAnInt() {
        return 1;
    }

    @Override
    public String toString() {
        return "MyClass object at " + super.toString();
    }

    @SuppressWarnings("deprecation")
    public void useDeprecatedMethod() {
        System.out.println(returnAnInt());
    }

    @SafeVarargs
    public final <T> void printElements(@NonNull T... elements) {
        for (T t : elements)
            System.out.println(t);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(100, "string");
        obj.useDeprecatedMethod();
        obj.printElements(1, 2, 3, "bla bla", "Java");
    }
}
