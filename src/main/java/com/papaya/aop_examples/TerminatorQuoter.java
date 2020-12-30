package com.papaya.aop_examples;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class TerminatorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("I'll be back");
    }
}
