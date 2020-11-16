package com.papaya.our_spring;

import com.papaya.heroes.RandomUtil;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class PowerCleaner implements Cleaner {

    @InjectRandomInt(min = 3, max = 6)
    private int repeat;


    public PowerCleaner() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("SSHHHHHHHHHHHHHHHhhhhhhhhhsssssss");
        }
    }
}
