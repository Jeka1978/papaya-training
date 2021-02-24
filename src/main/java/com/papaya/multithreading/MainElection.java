package com.papaya.multithreading;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class MainElection {
    @SneakyThrows
    public static void main(String[] args) {


        List<Supplier<Integer>> supplierList = List.of(() -> 5, () -> 6, () -> 7);
        int sum = supplierList.parallelStream()
                .mapToInt(Supplier::get)
                .sum();

        System.out.println("sum = " + sum);


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Future<Integer>> futures = new ArrayList<>();

        Faker faker = new Faker();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 3; i++) {
            futures.add(executorService.submit(new VoteCalculator(new City(faker.gameOfThrones().city(), i*100))));
        }

        System.out.println(futures.size());

        int total = 0;
        for (Future<Integer> future : futures) {
            total+=future.get();
        }

        System.out.println("total = " + total);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        executorService.shutdown();




    }
}
