package br.com.rafael.nested_classes.ex03;

import java.util.Iterator;

//Inner classes may be well-used when building iterators to data structures.
//To handle user interface events, you must know how to use inner classes,
// because the event-handling mechanism makes extensive use of them.

public class DataStructure {
    private final int[] arrayOfIntegers;
    private final int size;

    public DataStructure(int... integers) {
        arrayOfIntegers = integers;
        size = integers.length;
    }

    public DataStructure(int start, int end) {
        if (start > end)
            throw new IllegalArgumentException("end must be greater than or equal to start");
        size = Math.abs(end) - Math.abs(start) + 1;
        arrayOfIntegers = new int[size];
        for (int value = start, i = 0; i < size; value++, i++)
            arrayOfIntegers[i] = value;
    }

    public DataStructureIterator evenIterator() {
        return new EvenIterator();
    }

    public DataStructureIterator oddIterator() {
        return new OddIterator();
    }

    public int getSize() {
        return size;
    }

    /**
     * Interface inside a class to be implemented by an inner class.
     */
    interface DataStructureIterator extends Iterator<Integer> {}

    /**
     * The base iterator interface of this data structure.
     */
    private abstract class BaseIterator implements DataStructureIterator {
        private int index;

        private BaseIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index < DataStructure.this.size;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                Integer toReturn = DataStructure.this.arrayOfIntegers[index];
                index += 2;
                return toReturn;
            }
            return null;
        }
    }

    /**
     * An iterator to step through only even indexes of this data structure.
     */
    private class EvenIterator extends BaseIterator {
        private EvenIterator() {
            super(0);
        }
    }

    /**
     * An iterator to step through only odd indexes of this data structure.
     */
    private class OddIterator extends BaseIterator {
        private OddIterator() {
            super(1);
        }
    }
}
