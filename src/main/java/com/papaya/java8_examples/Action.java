package com.papaya.java8_examples;

/**
 * @author Evgeny Borisov
 */

@FunctionalInterface
public interface Action<T> {
    void doAction(T t);
}
