package br.com.rafael.labels;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 2, 4}, {5, 6, 7, 8}, {9, 11, 12, 13}, {14, 15, 16, 17}};
        System.out.println(Arrays.toString(findValue(17, matrix)));
        System.out.println(Arrays.toString(findValue(9, matrix)));
        System.out.println(count(2, 0, matrix));
        System.out.println(count(17, 3, matrix));
    }

    private static int[] findValue(int value, int[][] matrix) {
        if (matrix == null)
            throw new IllegalArgumentException("matrix cannot be null");
        int[] rowAndCol = null;
        label:
            for (int r = 0; r < matrix.length; r++)
                for (int c = 0; c < matrix[r].length; c++)
                    if (matrix[r][c] == value) {
                        rowAndCol = new int[]{r, c};
                        break label;
                    }
        return rowAndCol;
    }

    private static int count(int valueToCount, int rowIndex, int[][]matrix) {
        if (matrix == null)
            throw new IllegalArgumentException("matrix cannot be null");
        if (rowIndex >= matrix.length)
            throw new IllegalArgumentException("invalid row index for this matrix");
        int counter = 0;
        label:
            for (int r = 0; r < matrix.length; r++)
                for (int c = 0; c < matrix[r].length; c++) {
                    if (r < rowIndex) //Go to the next line...
                        continue label;
                    else if (r > rowIndex) //Line already checked...
                        break label;
                    if (matrix[r][c] == valueToCount)
                        counter++;
                }
        return counter;
    }
}
