package com.papaya.java8_examples;

import lombok.SneakyThrows;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {


    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> action) {

        for (T t : list) {
            action.accept(t);
            Thread.sleep(delay);
        }
    }

    public static <T> int countDuplicates(T t, List<T> list, Equalator<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.equals(t, t1)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);

        integers.forEach(System.out::println);


        for (Integer integer : integers) {
            System.out.println(integer);
        }

        integers.forEach(System.out::println);


        ListUtils.forEachWithDelay(integers, 500, (integer) -> System.out.println(integer));
    }
}








