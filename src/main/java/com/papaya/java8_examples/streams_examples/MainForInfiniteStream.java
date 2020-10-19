package com.papaya.java8_examples.streams_examples;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class MainForInfiniteStream {
    public static void main(String[] args) {
        Stream.iterate(10,integer -> integer+2)
                .peek(System.out::println)
                .skip(3).limit(10).forEach(System.out::println);
    }
}
