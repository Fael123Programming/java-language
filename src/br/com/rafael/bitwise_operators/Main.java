package br.com.rafael.bitwise_operators;

public class Main {
    public static void main(String[] args) {
//     '|' OR:
//     -> If one of the operands is the result of a potency of 2 and is greater than the other operand, then it will
//     yield the SUM between them;
//     ->
//     256(10) = 100000000(2)
//     13(10) = 1101(2)
//        System.out.println(Integer.parseInt("100000000", 2));
//        System.out.println(Integer.parseInt("1101", 2));
        System.out.println(256 | 13);
//        100000000
//      | 000001101
//       -----------
//        100001101(2)
        System.out.println(Integer.parseInt("100001101", 2));
        System.out.println(13 | 26);
    }
}
