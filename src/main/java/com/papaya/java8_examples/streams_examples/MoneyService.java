package com.papaya.java8_examples.streams_examples;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
public class MoneyService {


    public static void main(String[] args) {
        int answer = IntStream.iterate(1, i -> 1).parallel().limit(100).reduce(Integer::sum)
                .orElse(666);
        System.out.println("answer = " + answer);
    }

    public long totalRevenueAmount(Stream<Money> stream) {
       return stream.map(MoneyService::convertToTheSameCurrency)
                .mapToInt(Money::getAmount).sum();
    }


    public Optional<Money> totalRevenue(Stream<Money> stream) {
//        if (stream.count() == 0) {
//            return Optional.empty();
//        }
//        if (stream.count() == 1) {
//            return Optional.of(stream.collect(toList()).get(0));
//        }
//
        return stream.map(MoneyService::convertToTheSameCurrency)
                .reduce(MoneyService::plusMoney);
    }




    public static Money plusMoney(Money money,Money money2) {
        return Money.builder().currency(money.getCurrency()).amount(money.getAmount() + money2.getAmount()).build();
    }


    public static Money convertToTheSameCurrency(Money money) {
        String linkToTheRate = money.getCurrency().getLinkToTheRate();
        int multipledByCofficientProviededByTheLink=10;
        return Money.builder().currency(money.getCurrency()).amount(multipledByCofficientProviededByTheLink).build();
    }
}
