package com.papaya.java8_examples;

/**
 * @author Evgeny Borisov
 */



@FunctionalInterface
public interface Equalator<T> {
    boolean equals(T t, T t1);





    static StringIgnoreCaseEqualor stringIgnoreCaseEqualor(){
        return new StringIgnoreCaseEqualor();
    }
}
