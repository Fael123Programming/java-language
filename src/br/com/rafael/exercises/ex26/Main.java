package br.com.rafael.exercises.ex26;

public class Main {
    public static void main(String[] args) {
        int[][]numbers = {
                {1, 90, 678, 111},
                {1, 78, -456},
                {820, 342, 678, 100, 4567},
                {12, 5, 4, -899, 123}
        };
        search(4, numbers);
        search(123, numbers);
        search(900, numbers);
    }

    private static void search(int value, int[][]array) {
        boolean found = false;
        int i, j = 0;
        searchBlock:
            for (i = 0; i < array.length; i++)
                for (j = 0; j < array[i].length; j++)
                    if (array[i][j] == value) {
                        found = true;
                        break searchBlock; //labeled break statement.
                    }
        if (found)
            System.out.println(value + " found at [" + i + "][" + j + "]");
        else
            System.out.println(value + " not found");
    }
}
