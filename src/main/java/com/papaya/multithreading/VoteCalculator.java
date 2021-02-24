package com.papaya.multithreading;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VoteCalculator implements Callable<Integer> {

    private City city;

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        return city.getAmount()*2;
    }
}
