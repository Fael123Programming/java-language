package br.com.rafael.exercises.ex19;

public class IntegerType {
    private int number;

    public IntegerType(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
