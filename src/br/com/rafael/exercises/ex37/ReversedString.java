package br.com.rafael.exercises.ex37;

public class ReversedString implements CharSequence {
    private final String str;

    public ReversedString(String str) {
        this.str = new StringBuffer(str).reverse().toString();
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return str.subSequence(start, end);
    }

    @Override
    public String toString() {
        return str;
    }
}
