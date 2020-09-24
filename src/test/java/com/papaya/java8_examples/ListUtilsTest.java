package com.papaya.java8_examples;


import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {


    @Test
    public void countDuplicates() {



        List<String> list = List.of("java", "java", "scala", "JAVA", "JaVa", "ruby");

        list.forEach(s -> System.out.println(s.toUpperCase()));

        list.sort((o1, o2) -> o1.length() - o2.length());


        int answer = ListUtils.countDuplicates("java", list, (s, t1) -> s.length() == t1.length());


        Assert.assertEquals(5, answer);
    }
}