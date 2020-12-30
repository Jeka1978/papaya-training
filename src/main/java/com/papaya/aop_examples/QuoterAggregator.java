package com.papaya.aop_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class QuoterAggregator {
    @Autowired
    private List<Quoter> quoters;

    public void printQuotes() {
        quoters.forEach(Quoter::sayQuote);
    }
}
