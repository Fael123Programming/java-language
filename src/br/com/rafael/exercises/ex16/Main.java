package br.com.rafael.exercises.ex16;

public class Main {
    public static void main(String[] args) {
//      Arrays are objects and have their fields initialized with default values.
        String[] strings = new String[6];
        for (String str : strings)
            System.out.println(str);
        double[] values = new double[10];
        for (double num : values)
            System.out.println(num);
        int[][] matrix = new int[4][4];
        for (int[] row : matrix) {
            for (int colEle : row)
                System.out.print(colEle + " ");
            System.out.println();
        }
        System.out.println("Traditional for: structured programming");
        System.out.println("Foreach: OOP");
        for (byte i = 3; i <= 11; i += 2)
            if (i != 7)
                System.out.println(i);
        byte i = 0;
        boolean logic = true;
        while (logic) {
            System.out.println("Java is pretty cool!");
            if (i == 4)
                logic = false;
            i++;
        }
    }
}
