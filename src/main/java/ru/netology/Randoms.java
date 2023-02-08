package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();

    private int min;
    private int max;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator(min);
    }

    private class RandomIterator implements Iterator<Integer> {
        int index;

        public RandomIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return ((min - 1) + random.nextInt(max - min + 1)) <= max;
        }

        @Override
        public Integer next() {
            return index + random.nextInt(max - min + 1);
        }
    }
}
