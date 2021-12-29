package br.com.rafael.exercises.ex06.loan;

public class LoanCalculator {
    /**
     * Calculates information about a possible
     * loan and returns it inside a string.
     * @param moneyQuantity the desired amount of money
     * @param tax the tax that the amount will increase monthly
     * @param time quantity of months the loan will bear
     * @param installments quantity of installments to be paid
     * @return a string containing all information about the loan or null if
     * it could not be calculated
     * @throws IllegalArgumentException if one of the arguments passed is <= 0
     */
    public static String calculate(double moneyQuantity, double tax, int time, int installments) throws IllegalArgumentException {
        if (moneyQuantity <= 0)
            throw new IllegalArgumentException("moneyQuantity must be > 0");
        if (tax <= 0)
            throw new IllegalArgumentException("tax must be > 0");
        if (time <= 0)
            throw new IllegalArgumentException("time must be > 0");
        if (installments <= 0)
            throw new IllegalArgumentException("instalments must be > 0");
        double finalMoneyQuantity = moneyQuantity + moneyQuantity * tax * time;
        StringBuilder information = new StringBuilder();
        information.append("Amount of money------------ $").append(moneyQuantity).append("\n");
        information.append("Final amount of money------ $").append(finalMoneyQuantity).append("\n");
        information.append("Installments--------------- ").append(installments).append("\n");
        information.append("Value of each installment-- $").append(finalMoneyQuantity / installments).append("\n");
        return information.toString();
    }
}
