package br.com.rafael.utilitary_classes.strings;

public class Test2 {
    public static void main(String[] args) {
//        StringBuilder and StringBuffer are classes that provide us a faster way
//        of creating mutable strings. Also, those strings are not put into the
//        String Constant Pool. StringBuilder does not ensure thread safety.
//        StringBuffer does it using synchronized on its behaviour.
        long start, end;
        int q = 250000;
        System.out.println("Working with: " + q + " strings of character");
        start = System.currentTimeMillis();
        stringGenerator(q);
        end = System.currentTimeMillis();
        System.out.println("Time (with String): " + (end - start));
//        1,000,000 makes it to spend too much time!
        start = System.currentTimeMillis();
        strGenerator(q); //Using a StringBuilder is faster than String only.
        end = System.currentTimeMillis();
        System.out.println("Time (with StringBuilder): " + (end - start));
        start = System.currentTimeMillis();
        sGenerator(q); //Using a StringBuffer is faster than String only.
        end = System.currentTimeMillis();
        System.out.println("Time (with StringBuffer): " + (end - start));
    }

    private static void stringGenerator(int quantityOfStrings) {
        String string = "";
        for (int i = 0; i < quantityOfStrings; i++)
            string += i; //Creating a new string at each repetition.
    }

    private static void strGenerator(int quant) {
        StringBuilder builder = new StringBuilder(quant); //Capacity.
        for (int i = 0; i < quant; i++)
            builder.append(i);
    }

    private static void sGenerator(int quant) {
        StringBuffer buffer = new StringBuffer(quant);
        for (int i = 0; i < quant; i++)
            buffer.append(i);
    }
}
