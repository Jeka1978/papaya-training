package com.papaya.heroes;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RandomUtil {
    private static Random random = new Random();

    private RandomUtil() {
    }


    public static <T> T randomItem(List<T> list) {
        int i = getRandomBetween(0, list.size());
        return list.get(i);
    }

    public static int getRandomBetween(int min, int max) {

        return random.nextInt(max - min) + min;
    }
}
