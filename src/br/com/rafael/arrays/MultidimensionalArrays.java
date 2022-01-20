package br.com.rafael.arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] m1 = {{9, 1, 4, 2}, {8, 5, 0, 1}, {3, 3, 7, 2}, {9, 9, 1, 4}};
        int[][] m2 = {{1, 1, 4, 2}, {6, 7, 3, 0}, {3, 3, 1, 9}, {0, 0, 2, 1}};
        int [][][] matrixArray = new int[3][4][4];
        matrixArray[0] = m1;
        matrixArray[1] = m2;
        matrixArray[2] = new int[][]{{1, 4, 4, 3}, {8, 0, 3, 5}, {1, 3, 2, 9}, {0, 1, 5, 3}};
        printMatrix(matrixArray[0]);
        System.out.println("---------------");
        printMatrix(matrixArray[1]);
        System.out.println("---------------");
        printMatrix(matrixArray[2]);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] r : matrix) {
            for (int c = 0; ; c++) {
                System.out.print(r[c]);
                if (c == r.length - 1)
                    break;
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
