package Patterns3Iter;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    int min, max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Object next() {
                return random.nextInt(max - min + 1) + min;
            }
        };
    }

}

