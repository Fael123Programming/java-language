package br.com.rafael.exercises.ex27;

public class Test {
    public static void main(String[] args) {
        SubstringVerifier verifier = new SubstringVerifier();
        String srcStr = "Which is better? Java or Python? c#", otherStr = "c#";
        boolean result = verifier.verify(srcStr, otherStr);
        System.out.println("Found it? " + result);
        System.out.println("Start pos: " + verifier.getStartPos());
        System.out.println("End pos: " + verifier.getEndPos());
        System.out.println(srcStr.substring(verifier.getStartPos(), verifier.getEndPos() + 1));
    }
}
