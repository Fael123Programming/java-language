package br.com.rafael.exercises.ex36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MERCHANDISES = 3;
        Scanner input = new Scanner(System.in);
        double[][] prices = new double[MERCHANDISES][2]; //Prices of purchase and sale.
        double profitPercentage;
        int lessThan10 = 0, between10and20 = 0, greaterThan20 = 0;
        for (int i = 0; i < MERCHANDISES; i++) {
            System.out.println("-------------------------");
            System.out.println("Merchandise " + (i + 1));
            System.out.println("-------------------------");
            System.out.print("Price of purchase: $");
            prices[i][0] = input.nextDouble();
            System.out.print("Price of sale:$");
            prices[i][1] = input.nextDouble();
        }
        for (int i = 0; i < MERCHANDISES; i++) {
            profitPercentage = (prices[i][1] - prices[i][0]) / prices[i][0]; //(sale - purchase) / purchase.
            if (profitPercentage < 0.1) {
                lessThan10++;
            } else if (profitPercentage <= 0.2) {
                between10and20++;
            } else {
                greaterThan20++;
            }
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("There is (are) " + lessThan10 + " merchandise(s) that yield profit less than 10%");
        System.out.println("There is (are) " + between10and20 + " merchandise(s) that yield profit between 10% and 20%");
        System.out.println("There is (are) " + greaterThan20 + " merchandise(s) that yield profit greater than 20%");
    }
}