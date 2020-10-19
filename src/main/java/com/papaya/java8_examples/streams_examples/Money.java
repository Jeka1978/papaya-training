package com.papaya.java8_examples.streams_examples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Money {
    private Currency currency;
    private int amount;
}
