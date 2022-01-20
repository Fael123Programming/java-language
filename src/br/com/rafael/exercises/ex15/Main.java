package br.com.rafael.exercises.ex15;


public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(strArray(array));

    }

    private static String strArray(int[] array) {
        if (array == null)
            return "null";
        int size = array.length;
        if (size == 0)
            return "[]";
        StringBuilder b = new StringBuilder("[");
        for (int i = 0; ; i++) {
            b.append(array[i]);
            if (i == size - 1)
                return b.append("]").toString();
            b.append(", ");
        }
    }

}
