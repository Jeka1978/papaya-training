package com.papaya.java8_examples;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class MainHowToRemoveSometingFromCollection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Arnold", "Silvester", "Chuck Norris", "Brus lee"));

        String guyToRemove = "Chuck Norris";

        list.removeIf(s -> s.equalsIgnoreCase(guyToRemove));

        System.out.println(list);





    }
}
