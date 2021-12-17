package br.com.rafael.hexadecimal_numbers;

public class Main {
    public static void main(String[] args) {
//        A number is represented in hexadecimal using the pattern: 0[xX]([0-9a-fA-F])+
//        That is, 0 + (x or X) + (numbers from 0 through 9, letters from a or A through f or F).
//        "+" means that they can repeat.
        int fifteen = 0xF;
        System.out.println(fifteen);
        int sixteen = 0x10;
        System.out.println(sixteen);
        int seventeen = 0X11;
        System.out.println(seventeen);
    }
}
