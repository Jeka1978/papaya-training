package com.papaya.our_spring;

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
    @Benchmark
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("SSHHHHHHHHHHHHHHHhhhhhhhhhsssssss");
        }
    }
}
