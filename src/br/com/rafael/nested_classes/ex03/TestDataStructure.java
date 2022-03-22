package br.com.rafael.nested_classes.ex03;

import br.com.rafael.nested_classes.ex03.DataStructure.DataStructureIterator;

public class TestDataStructure {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure(0, 9);
        System.out.println(ds.getSize() + " elements");
        DataStructureIterator it = ds.evenIterator();
        ds.print(it);
        System.out.println("----------------------------");
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
        System.out.println("----------------------------");
        ds.print(i -> i % 2 == 0); //Even indexes!
        System.out.println("----------------------------");
        ds.print(i -> i % 2 == 1); //Odd indexes!
//      These couple of lambda expressions receives an integer as argument, validates it
//      and returns a boolean value as result.
        System.out.println("----------------------------");
        ds.print(DataStructure::isEvenIndex);
        System.out.println("----------------------------");
        ds.print(DataStructure::isOddIndex);
//        Object obj = 100;
//        System.out.println(obj);
//        obj = true;
//        System.out.println(obj);
//        obj = "String";
//        System.out.println(obj);
    }
}
