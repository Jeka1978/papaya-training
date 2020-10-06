package com.papaya.java8_examples.animals;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface AnimalCreator {
    Animal create();
}
