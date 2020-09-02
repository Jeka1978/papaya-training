package com.papaya.test_runners;

import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class TestRunner {
    public static void runAllTests(String className) throws Exception{
        Class<?> aClass = Class.forName(className);

        Method[] methods = aClass.getMethods();


        for (Method method : methods) {
            if (method.getName().startsWith("test")||method.isAnnotationPresent(MyTest.class)) {
                Object o = aClass.getDeclaredConstructor().newInstance();
                method.invoke(o);
            }
        }


    }


}
