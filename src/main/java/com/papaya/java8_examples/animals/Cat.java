package com.papaya.java8_examples.animals;

/**
 * @author Evgeny Borisov
 */
public class Cat implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("mau");
    }
}
