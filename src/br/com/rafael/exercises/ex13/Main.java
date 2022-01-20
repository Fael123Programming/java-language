package br.com.rafael.exercises.ex13;

public class Main {
    public static void main(String[] args) {
        printMatrix(matrixGenerator(10, 10));
    }

    private static int[][] matrixGenerator(int rows, int cows) {
        int[][] matrix =  new int[rows][cows];
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cows; c++)
                matrix[r][c] = random(0, 9);
        return matrix;
    }

    private static int random(int from, int to) {
        assert from <= to: from + " must be less than or equal to " + to;
        return (int) (from + Math.random() * (to + 1 - from));
    }

    private static void printMatrix(int[][] matrix) {
        System.out.print("\t");
        for (int c = 0; c < matrix[0].length; c++) {
            if (c < matrix[0].length - 1)
                System.out.print(c + "\t");
            else
                System.out.println(c);
        }
        for (int r = 0; r < matrix.length; r++) {
            System.out.print(r + "\t");
            for (int c = 0; c < matrix[r].length; c++) {
                if (c < matrix[r].length - 1)
                    System.out.print(matrix[r][c] + "\t");
                else
                    System.out.println(matrix[r][c]);
            }
        }
    }
}
