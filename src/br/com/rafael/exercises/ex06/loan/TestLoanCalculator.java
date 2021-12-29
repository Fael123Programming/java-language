package br.com.rafael.exercises.ex06.loan;

public class TestLoanCalculator {
    public static void main(String[] args) {
        System.out.println(LoanCalculator.calculate(100000, 0.02, 24, 80));
        System.out.println(LoanCalculator.calculate(5000, 0.015, 6, 5));
    }
}
