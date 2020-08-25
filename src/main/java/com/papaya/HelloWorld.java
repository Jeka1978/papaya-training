package com.papaya;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.papaya.file_system.Human;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

/**
 * @author Evgeny Borisov
 */
public class HelloWorld {


    public static void main(String[] args)  {

        Human human = new Human();
        human.incAge(1,2,4);


        System.out.println(AllConst.NAME);
        System.out.println(UIConst.WIDTH);


        System.out.println(12);
        Cache<Object, Object> cache = CacheBuilder.newBuilder().maximumSize(10).expireAfterAccess(2, TimeUnit.DAYS).weakKeys().softValues().build();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        Thread.sleep(1000000);
    }
}
