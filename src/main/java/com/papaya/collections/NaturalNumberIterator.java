package com.papaya.collections;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class NaturalNumberIterator implements Iterator<Integer> {

    private int x = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return x++;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("not supported");
    }
}
