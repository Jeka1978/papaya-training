package com.papaya.java8_examples.animals;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {

    private int lifePoints;
    private int age;
    @Override
    public void makeVoice() {
        System.out.println("bark");
    }
}
