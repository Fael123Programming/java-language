package br.com.rafael.nested_classes.ex03;

import br.com.rafael.nested_classes.ex03.DataStructure.DataStructureIterator;

public class TestDataStructure {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure(0, 9);
        System.out.println(ds.getSize() + " elements");
        DataStructureIterator it = ds.evenIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext())
                System.out.print(", ");
        }
        System.out.println();
        it = ds.oddIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext())
                System.out.print(", ");
        }
    }
}
