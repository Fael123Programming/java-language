package br.com.rafael.nested_classes.ex03;

import br.com.rafael.nested_classes.ex03.DataStructure.DataStructureIterator;

public class TestDataStructure {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure(0, 9);
        System.out.println(ds.getSize() + " elements");
        DataStructureIterator it = ds.evenIterator();
        ds.print(it);
        System.out.println();
        ds.print(new DataStructureIterator() {
            private int index;

            {
                index = 1;
            }

            @Override
            public boolean hasNext() {
                return index < ds.getSize();
            }

            @Override
            public Integer next() {
                Integer next = null;
                if (hasNext()) {
                    next = ds.arrayOfIntegers[index];
                    index += 2;
                }
                return next;
            }
        });
        System.out.println();
    }
}
