package com.papaya.java8_examples;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {



    public static <T> void forEachWithDelay(List<T> list,int dealay /* todo this about additional parameter*/){
        //todo finish this
//        Thread.sleep(dealay);
    }

    public static <T> int countDuplicates(T t, List<T> list, Equalator<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                counter++;
            }
        }
        return counter;
    }
}
