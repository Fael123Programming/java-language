package br.com.rafael.enumeration_3.ex01;


public class Test {
    public static void main(String[] args) {
        Days[] days = Days.values();
        for (int i = 0; ; i++) {
            System.out.print(days[i]);
            if (i < days.length - 1)
                System.out.print(", ");
            else
                break;
        }
    }
}
