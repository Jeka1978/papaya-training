package com.papaya.aop_examples;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ShakespearQuoter implements Quoter {
    @Override
    @Important
    public void sayQuote() {
        System.out.println("2 B || ! 2 B");
    }
}
