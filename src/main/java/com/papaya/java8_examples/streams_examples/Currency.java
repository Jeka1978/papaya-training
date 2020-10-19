package com.papaya.java8_examples.streams_examples;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Getter
public enum Currency {
    USD("DOLLARS","http://rate.america.com"),ILS("NIS","http://rate.america.com"),MAO("GRIVNA","http://rate.america.com");

    private final String currencyName;
    private final String linkToTheRate;

}
