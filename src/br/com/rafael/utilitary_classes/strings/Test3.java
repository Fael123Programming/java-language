package br.com.rafael.utilitary_classes.strings;

public class Test3 {
    public static void main(String[] args) {
//        Check out StringBuilder and StringBuffer documentation.
        StringBuilder builder = new StringBuilder(20);
        StringBuilder builder2 = new StringBuilder("A builder");
        builder.append('D');
        builder.append("Just a simple phrase");
        System.out.println(builder.delete(0, 6)); //Non-inclusive. It will delete (end - 1) characters from position start.
        System.out.println(builder.insert(0, "This is ")); //Insert at position 0 the following string.

    }
}
